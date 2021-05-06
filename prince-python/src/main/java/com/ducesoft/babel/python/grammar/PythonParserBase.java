/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.python.grammar;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 * @author coyzeng@gmail.com
 */
public abstract class PythonParserBase extends Parser
{
    public PythonVersion Version = PythonVersion.Autodetect;

    protected PythonParserBase(TokenStream input) {
        super(input);
    }

    protected boolean CheckVersion(int version) {
        return Version == PythonVersion.Autodetect || version == Version.getValue();
    }

    protected void SetVersion(int requiredVersion) {
        if (requiredVersion == 2) {
            Version = PythonVersion.Python2;
        } else if (requiredVersion == 3) {
            Version = PythonVersion.Python3;
        }
    }
}

