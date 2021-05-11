/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

import com.ducesoft.babel.emperor.tool.RunArg;

import java.io.File;

/**
 * @author coyzeng@gmail.com
 */
public interface Context {

    void print(String msg, Object... args);

    void println(String msg, Object... args);

    RunArg getArgs();

    File getWorkspace();
}
