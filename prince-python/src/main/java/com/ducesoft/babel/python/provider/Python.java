/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.python.provider;

import com.ducesoft.babel.emperor.spi.*;
import com.ducesoft.babel.python.grammar.PythonLexer;
import com.ducesoft.babel.python.grammar.PythonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author coyzeng@gmail.com
 */
@Lang({"*.py"})
public class Python implements Language {

    private final PythonTransformer transformer = new PythonTransformer();
    private final PythonInterpreter interpreter = new PythonInterpreter();

    @Override
    public Language withContext(Context context) {
        return this;
    }

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
        return this.interpreter;
    }
}
