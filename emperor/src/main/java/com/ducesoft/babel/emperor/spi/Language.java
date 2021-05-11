/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * Annotated with {@link Lang}
 *
 * @author coyzeng@gmail.com
 */
public interface Language {

    /**
     * Initial language with transform context.
     *
     * @param context transform context.
     * @return initialed language.
     */
    Language withContext(Context context);

    /**
     * Create language character lexer.
     *
     * @param chars ast character stream.
     * @return character lexer.
     */
    Lexer createLexer(CharStream chars);

    /**
     * Create language token parser.
     *
     * @param ts ast token stream.
     * @return token parser.
     */
    Parser createParser(TokenStream ts);

    /**
     * Get the language transformer.
     *
     * @return language transformer.
     */
    Transformer getTransformer();

    /**
     * Get the language interpreter.
     *
     * @return language interpreter.
     */
    Interpreter getInterpreter();
}
