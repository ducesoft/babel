/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.kit;

import com.ducesoft.babel.emperor.spi.Interpreter;

import java.util.ServiceLoader;

/**
 * @author coyzeng@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<Interpreter> interpreters = ServiceLoader.load(Interpreter.class);
        for (Interpreter interpreter : interpreters) {
            interpreter.hashCode();
        }
    }
}
