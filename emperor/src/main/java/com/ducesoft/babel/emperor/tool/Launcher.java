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
import com.ducesoft.babel.emperor.spi.Letter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.ServiceLoader.Provider;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author coyzeng@gmail.com
 */
public class Launcher {

    public static void main(String[] args) {
        RunArg arg     = new RunArg();
        var    command = JCommander.newBuilder().addObject(arg).build();
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
            doGen(new Console(arg, command.getConsole()));
        } catch (Throwable e) {
            command.getConsole().println(e.getMessage());
        }
    }


    public static void doGen(Context context) throws Throwable {
        Predicate<Path> includeTest = path -> path.getFileName().toString().endsWith(context.getArgs().getInclude());
        Predicate<Path> excludeTest = path -> path.getFileName().toString().endsWith(context.getArgs().getExclude());

        List<Path>  sources = new ArrayList<>();
        Deque<Path> paths   = new ArrayDeque<>();
        paths.push(Paths.get(URI.create(context.getArgs().getInput())));
        while (null != paths.peek()) {
            Path path = paths.pop();
            if (Files.isDirectory(path)) {
                Files.list(path).forEach(paths::push);
                continue;
            }
            if (!includeTest.test(path) || excludeTest.test(path)) {
                continue;
            }
            sources.add(path);
        }
        List<Language> languages = ServiceLoader
                .load(Language.class)
                .stream()
                .filter(lang -> lang.type().isAnnotationPresent(Letter.class))
                .map(Provider::get)
                .map(lang -> lang.withContext(context))
                .collect(Collectors.toList());
        BiFunction<Path, List<Language>, Optional<Language>> selector = (path, providers) -> {
            for (Language provider : providers) {
                for (String regex : provider.getClass().getAnnotation(Letter.class).value()) {
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
