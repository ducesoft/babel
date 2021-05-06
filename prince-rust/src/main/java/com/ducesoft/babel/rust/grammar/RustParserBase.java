/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.rust.grammar;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author coyzeng@gmail.com
 */
public abstract class RustParserBase extends Parser {
    public RustParserBase(TokenStream input){
        super(input);
    }

    public boolean next(char expect){
        return _input.LA(1) == expect;
    }
}