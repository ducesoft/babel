/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.javascript.provider;

import com.ducesoft.babel.emperor.spi.Interpreter;
import com.ducesoft.babel.emperor.spi.Language;
import com.ducesoft.babel.emperor.spi.Letter;
import com.ducesoft.babel.javascript.grammar.JavaScriptLexer;
import com.ducesoft.babel.javascript.grammar.JavaScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * @author coyzeng@gmail.com
 */
@Letter({"*.js", "*.es", "*.es5", "*.es6"})
public class Javascript implements Language {

    private final JavascriptListener listener = new JavascriptListener();

    @Override
    public Lexer createLexer(CharStream chars) {
        return new JavaScriptLexer(chars);
    }

    @Override
    public Parser createParser(TokenStream ts) {
        return new JavaScriptParser(ts);
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
