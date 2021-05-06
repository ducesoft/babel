/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.javascript.provider;

import com.ducesoft.babel.emperor.spi.Repository;
import com.ducesoft.babel.emperor.struct.Dependency;

import java.nio.file.Path;

/**
 * @author coyzeng@gmail.com
 */
public class NpmRepository implements Repository {

    @Override
    public Path load(Dependency dependency) throws Throwable {
        return null;
    }
}
