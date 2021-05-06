/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.rust.provider;

import com.ducesoft.babel.emperor.spi.Transformer;
import com.ducesoft.babel.emperor.spi.MtQueue;
import com.ducesoft.babel.rust.grammar.RustParserBaseListener;

/**
 * @author coyzeng@gmail.com
 */
public class RustTransformer extends RustParserBaseListener implements Transformer {

    @Override
    public MtQueue transform() {
        return null;
    }
}
