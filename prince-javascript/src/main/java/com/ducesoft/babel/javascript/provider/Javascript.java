/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.javascript.provider;

import com.ducesoft.babel.emperor.spi.*;
import com.ducesoft.babel.javascript.grammar.JavaScriptLexer;
import com.ducesoft.babel.javascript.grammar.JavaScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author coyzeng@gmail.com
 */
@Lang({"*.js", "*.es", "*.es5", "*.es6"})
public class Javascript implements Language {

    private final JavascriptTransformer transformer = new JavascriptTransformer();
    private final JavascriptInterpreter interpreter = new JavascriptInterpreter();

    @Override
    public Language withContext(Context context) {
        return this;
    }

    @Override
    public Lexer createLexer(CharStream chars) {
        return new JavaScriptLexer(chars);
    }

    @Override
    public Parser createParser(TokenStream ts) {
        return new JavaScriptParser(ts);
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
