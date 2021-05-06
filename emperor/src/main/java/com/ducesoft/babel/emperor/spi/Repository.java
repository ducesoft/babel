/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

import com.ducesoft.babel.emperor.struct.Dependency;

import java.nio.file.Path;

/**
 * @author coyzeng@gmail.com
 */
public interface Repository {

    /**
     * Load the dependency source to local directory.
     *
     * @param dependency source library dependency
     * @return directory of local source
     */
    Path load(Dependency dependency);

}
