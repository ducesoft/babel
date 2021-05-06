/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

/**
 * @author coyzeng@gmail.com
 */
public interface Finer {

    void confinePackage(String name);

    void definePackage(String name);

    void confineType(String name);

    void defineType(String name);

    void confineMethod(String name);

    void defineMethod(String name);

    void confineParameter(String name);

    void defineParameter(String name);

    void confineReturn(String name);

    void defineReturn(String name);

    void confineVariable(String name);

    void defineVariable(String name);
}
