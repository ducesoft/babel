/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

import com.ducesoft.babel.emperor.struct.Dependency;

/**
 * @author coyzeng@gmail.com
 */
public interface Repository {

    /**
     * Load the dependency source to local directory.
     * <p>
     * If return true current repository accept the repository location.
     *
     * @param context source library dependency
     * @return directory of local source
     * @throws Throwable e
     */
    boolean accept(Context context, Dependency dependency) throws Throwable;

}
