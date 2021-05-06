/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.javascript.provider;

import com.ducesoft.babel.emperor.spi.Transformer;
import com.ducesoft.babel.emperor.spi.MtQueue;
import com.ducesoft.babel.javascript.grammar.JavaScriptParserBaseListener;

/**
 * @author coyzeng@gmail.com
 */
public class JavascriptTransformer extends JavaScriptParserBaseListener implements Transformer {

    @Override
    public MtQueue transform() {
        return null;
    }
}
