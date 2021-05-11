/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

import com.beust.jcommander.JCommander;
import com.ducesoft.babel.emperor.spi.Context;
import com.ducesoft.babel.emperor.spi.Interpreter;
import com.ducesoft.babel.emperor.spi.Language;
import com.ducesoft.babel.emperor.spi.Lang;
import com.ducesoft.babel.emperor.struct.BabelException;
import com.ducesoft.babel.emperor.struct.Dependency;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.ServiceLoader.Provider;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author coyzeng@gmail.com
 */
public class Launcher {

    private Launcher() {
    }

    public static void main(String[] args) {
        var arg      = new RunArg();
        var command  = JCommander.newBuilder().addObject(arg).build();
        var context  = new Console(arg, command.getConsole());
        var launcher = new Launcher();
        try {
            command.parse(args);
            if (arg.isHelp()) {
                command.usage();
                return;
            }
            if (arg.isVersion()) {
                var version = """
                        openjdk 16 2021-03-16
                        OpenJDK Runtime Environment (build 16+36-2231)
                        OpenJDK 64-Bit Server VM (build 16+36-2231, mixed mode, sharing)
                        """;
                command.getConsole().println(version);
                return;
            }
            launcher.transform(context);
        } catch (Throwable e) {
            e.printStackTrace();
            command.getConsole().println(e.getMessage());
        } finally {
            launcher.release(context);
        }
    }

    private void release(Context context) {
        try {
            Files.walk(context.getWorkspace().toPath()).map(Path::toFile).sorted((x, y) -> -x.compareTo(y))
                 .forEach(file -> {
                     if (!file.delete()) {
                         context.println("Finalize workspace unexpected. {}", file);
                     }
                 });
        } catch (IOException e) {
            context.println(e.getMessage());
        }
    }

    private Dependency dependenceOfInput(Context context) {
        try {
            if (null == context.getArgs().getInput()) {
                throw new BabelException("Arguments input cant be empty");
            }
            Function<String, String> format = location -> {
                if (location.startsWith("git@")) {
                    return location.replace(":", "/").replace("@", "://").replace(".git", "");
                }
                return location;
            };
            var uri    = URI.create(format.apply(context.getArgs().getInput()));
            var groups = Optional.ofNullable(uri.getPath()).map(x -> x.split("/")).orElseGet(() -> new String[0]);
            var root   = new Dependency();
            root.setGroup(String.format("%s/%s", uri.getHost(), (groups.length > 1 ? groups[1] : "")));
            root.setArtifactId(groups.length > 2 ? groups[2] : "");
            root.setVersion("");
            root.setScope("");
            return root;
        } catch (Throwable e) {
            throw new BabelException(e, "Cant resolve or process arguments input {}", context.getArgs().getInput());
        }
    }

    private boolean test(Path path, String expr) {
        if (null == expr || expr.trim().equals("")) {
            return true;
        }
        return path.getFileName().toString().matches(expr);
    }

    public void transform(Context context) throws Throwable {
        var root       = dependenceOfInput(context);
        var repository = Repositories.findAll();
        if (!repository.accept(context, root)) {
            throw new BabelException("Cant process resource {}", context.getArgs().getInput());
        }

        List<Path>  sources = new ArrayList<>();
        Deque<Path> paths   = new ArrayDeque<>();
        paths.push(context.getWorkspace().toPath());
        while (!paths.isEmpty()) {
            Path path = paths.pop();
            if (Files.isDirectory(path)) {
                Files.list(path).forEach(paths::push);
                continue;
            }
            if (!test(path, context.getArgs().getInclude()) || !test(path, context.getArgs().getExclude())) {
                continue;
            }
            sources.add(path);
        }
        List<Language> languages = ServiceLoader.load(Language.class).stream()
                                                .filter(lang -> lang.type().isAnnotationPresent(Lang.class))
                                                .map(Provider::get).map(lang -> lang.withContext(context))
                                                .collect(Collectors.toList());
        BiFunction<Path, List<Language>, Optional<Language>> selector = (path, providers) -> {
            for (Language provider : providers) {
                for (String regex : provider.getClass().getAnnotation(Lang.class).value()) {
                    if (path.toFile().getName().matches(regex)) {
                        return Optional.of(provider);
                    }
                }
            }
            return Optional.empty();
        };
        for (Path source : sources) {
            Optional<Language> lang = selector.apply(source, languages);
            if (lang.isEmpty()) {
                continue;
            }
            CharStream        chars  = CharStreams.fromPath(source.toAbsolutePath());
            Lexer             lexer  = lang.get().createLexer(chars);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Parser            parser = lang.get().createParser(tokens);
            ParseTreeWalker   walker = new ParseTreeWalker();
            walker.walk(lang.get().getTransformer(), parser.getContext());
        }
        for (Language lang : languages) {
            var         ast         = lang.getTransformer().transform();
            Interpreter interpreter = lang.getInterpreter();
            interpreter.interpret(ast);
        }
    }
}
