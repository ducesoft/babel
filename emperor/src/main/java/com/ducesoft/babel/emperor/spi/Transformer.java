/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * @author coyzeng@gmail.com
 */
public interface Transformer extends ParseTreeListener {

    MtQueue transform();

}
