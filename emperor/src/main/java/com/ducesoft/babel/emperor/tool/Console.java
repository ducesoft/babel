/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

import com.ducesoft.babel.emperor.spi.Context;

import java.io.File;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/**
 * @author coyzeng@gmail.com
 */
public class Console implements Context,
                                Serializable {

    @Serial
    private static final long                                  serialVersionUID = -560988653327562063L;
    private final        File                                  workspace;
    private final        RunArg                                arg;
    private final        com.beust.jcommander.internal.Console console;

    public Console(RunArg arg, com.beust.jcommander.internal.Console console) {
        String home    = System.getProperty("java.io.tmpdir");
        String version = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.arg       = arg;
        this.console   = console;
        this.workspace = new File(String.join(File.separator, home, version));
    }

    @Override
    public void print(String msg, Object... args) {
        this.console.print(Format.string(msg, args));
    }

    @Override
    public void println(String msg, Object... args) {
        this.console.println(Format.string(msg, args));
    }

    @Override
    public RunArg getArgs() {
        return this.arg;
    }

    @Override
    public File getWorkspace() {
        return this.workspace;
    }
}
