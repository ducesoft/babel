/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

import com.ducesoft.babel.emperor.tool.RunArg;

/**
 * @author coyzeng@gmail.com
 */
public interface Context {

    void print(String msg);

    void println(String msg);

    RunArg getArgs();
}
