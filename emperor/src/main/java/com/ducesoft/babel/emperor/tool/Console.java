/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

import com.ducesoft.babel.emperor.spi.Context;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@NoArgsConstructor
@AllArgsConstructor
public class Console implements Context,
                                Serializable {

    @Serial
    private static final long                                  serialVersionUID = -560988653327562063L;
    private              RunArg                                arg;
    private              com.beust.jcommander.internal.Console console;

    @Override
    public void print(String msg) {
        this.console.print(msg);
    }

    @Override
    public void println(String msg) {
        this.console.println(msg);
    }

    @Override
    public RunArg getArgs() {
        return this.arg;
    }
}
