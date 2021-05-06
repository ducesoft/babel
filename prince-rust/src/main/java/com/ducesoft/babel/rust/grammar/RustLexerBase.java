/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.rust.grammar;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

/**
 * @author coyzeng@gmail.com
 */
public abstract class RustLexerBase extends Lexer {
    public RustLexerBase(CharStream input){
        super(input);
    }

    public boolean SOF(){
        return _input.LA(-1) <=0;
    }

    public boolean next(char expect){
        return _input.LA(1) == expect;
    }

    public boolean floatDotPossible(){
        int next = _input.LA(1);
        // only block . _ identifier after float
        if(next == '.' || next =='_') return false;
        if(next == 'f') {
            // 1.f32
            if (_input.LA(2)=='3'&&_input.LA(3)=='2')return true;
            //1.f64
            return _input.LA(2) == '6' && _input.LA(3) == '4';
        }
        if(next>='a'&&next<='z') return false;
        return next < 'A' || next > 'Z';
    }
}
