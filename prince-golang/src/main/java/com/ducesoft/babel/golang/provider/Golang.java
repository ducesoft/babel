/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.golang.provider;

import com.ducesoft.babel.emperor.spi.*;
import com.ducesoft.babel.golang.grammar.GoLexer;
import com.ducesoft.babel.golang.grammar.GoParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author coyzeng@gmail.com
 */
@Lang({"*.go"})
public class Golang implements Language {

    private final GolangTransformer transformer = new GolangTransformer();
    private final GolangInterpreter interpreter = new GolangInterpreter();

    @Override
    public Language withContext(Context context) {
        return this;
    }

    @Override
    public Lexer createLexer(CharStream chars) {
        return new GoLexer(chars);
    }

    @Override
    public Parser createParser(TokenStream ts) {
        return new GoParser(ts);
    }

    @Override
    public Transformer getTransformer() {
        return this.transformer;
    }

    @Override
    public Interpreter getInterpreter() {
        return this.interpreter;
    }
}
