/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

/**
 * @author coyzeng@gmail.com
 */
public record RunArg(String repo, String output, String include, String exclude, String group) {

    public RunArg() {
        this("", "", "", "", "");
    }
}
