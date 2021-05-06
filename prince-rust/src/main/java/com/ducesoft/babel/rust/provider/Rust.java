/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.rust.provider;

import com.ducesoft.babel.emperor.spi.Interpreter;
import com.ducesoft.babel.emperor.spi.Language;
import com.ducesoft.babel.emperor.spi.Letter;
import com.ducesoft.babel.rust.grammar.RustLexer;
import com.ducesoft.babel.rust.grammar.RustParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * @author coyzeng@gmail.com
 */
@Letter({"*.rs"})
public class Rust implements Language {

    private final RustListener listener = new RustListener();

    @Override
    public Lexer createLexer(CharStream chars) {
        return new RustLexer(chars);
    }

    @Override
    public Parser createParser(TokenStream ts) {
        return new RustParser(ts);
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
