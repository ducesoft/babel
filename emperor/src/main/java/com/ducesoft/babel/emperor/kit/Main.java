/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.kit;

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
public class Main {

    public static void main(String[] args) {
        try {
            doGen(new RunArg());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }


    private static void doGen(RunArg args) throws Throwable {
        Predicate<Path> includeTest = path -> path.getFileName().toString().endsWith(args.include());
        Predicate<Path> excludeTest = path -> path.getFileName().toString().endsWith(args.exclude());

        List<Path>  sources = new ArrayList<>();
        Deque<Path> paths   = new ArrayDeque<>();
        paths.push(Paths.get(URI.create(args.repo())));
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
            walker.walk(lang.get().getListener(), parser.getContext());
        }
        for (Language lang : languages) {
            Interpreter interpreter = lang.getInterpreter();
            interpreter.print();
        }
    }
}
