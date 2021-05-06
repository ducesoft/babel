/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.java.provider;

import com.ducesoft.babel.emperor.spi.Interpreter;
import com.ducesoft.babel.emperor.spi.Language;
import com.ducesoft.babel.emperor.spi.Letter;
import com.ducesoft.babel.java.grammar.JavaLexer;
import com.ducesoft.babel.java.grammar.JavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * @author coyzeng@gmail.com
 */
@Letter({"*.java"})
public class Java implements Language {

    private final JavaListener listener = new JavaListener();

    @Override
    public Lexer createLexer(CharStream chars) {
        return new JavaLexer(chars);
    }

    @Override
    public Parser createParser(TokenStream ts) {
        return new JavaParser(ts);
    }

    @Override
    public ParseTreeListener getListener() {
        return this.listener;
    }

    @Override
    public Interpreter getInterpreter() {
        return null;
    }
}
