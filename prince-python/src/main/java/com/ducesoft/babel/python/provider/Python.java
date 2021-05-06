/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.python.provider;

import com.ducesoft.babel.emperor.spi.Interpreter;
import com.ducesoft.babel.emperor.spi.Language;
import com.ducesoft.babel.emperor.spi.Letter;
import com.ducesoft.babel.emperor.spi.Transformer;
import com.ducesoft.babel.python.grammar.PythonLexer;
import com.ducesoft.babel.python.grammar.PythonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author coyzeng@gmail.com
 */
@Letter({"*.py"})
public class Python implements Language {

    private final PythonTransformer transformer = new PythonTransformer();

    @Override
    public Lexer createLexer(CharStream chars) {
        return new PythonLexer(chars);
    }

    @Override
    public Parser createParser(TokenStream ts) {
        return new PythonParser(ts);
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
