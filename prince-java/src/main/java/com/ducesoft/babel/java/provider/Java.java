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
import com.ducesoft.babel.emperor.spi.Transformer;
import com.ducesoft.babel.java.grammar.JavaLexer;
import com.ducesoft.babel.java.grammar.JavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author coyzeng@gmail.com
 */
@Letter({"*.java"})
public class Java implements Language {

    private final JavaTransformer transformer = new JavaTransformer();

    @Override
    public Lexer createLexer(CharStream chars) {
        return new JavaLexer(chars);
    }

    @Override
    public Parser createParser(TokenStream ts) {
        return new JavaParser(ts);
    }

    @Override
    public Transformer getTransformer() {
        return this.transformer;
    }

    @Override
    public Interpreter getInterpreter() {
        return null;
    }
}
