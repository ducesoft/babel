/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.python.grammar;

/**
 * @author coyzeng@gmail.com
 */
public enum PythonVersion {
    Autodetect(0),
    Python2(2),
    Python3(3);

    private final int value;

    PythonVersion(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
