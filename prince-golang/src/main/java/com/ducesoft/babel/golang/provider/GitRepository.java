/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.golang.provider;

import com.ducesoft.babel.emperor.spi.Repository;
import com.ducesoft.babel.emperor.struct.Dependency;
import org.eclipse.jgit.api.Git;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author coyzeng@gmail.com
 */
public class GitRepository implements Repository {

    @Override
    public Path load(Dependency dependency) throws Throwable {
        var clone = Git.cloneRepository();
        clone.setURI("");
        var git = clone.call();
        return Paths.get(git.toString());
    }
}
