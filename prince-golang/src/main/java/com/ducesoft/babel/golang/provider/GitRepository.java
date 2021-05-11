/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.golang.provider;

import com.ducesoft.babel.emperor.spi.Context;
import com.ducesoft.babel.emperor.spi.Repository;
import com.ducesoft.babel.emperor.struct.Dependency;
import org.eclipse.jgit.api.Git;

/**
 * https://github.com/ducesoft/babel.git
 *
 * @author coyzeng@gmail.com
 */
public class GitRepository implements Repository {

    @Override
    public boolean accept(Context context, Dependency dependency) throws Throwable {
        var clone = Git.cloneRepository();
        clone.setURI(String.format("https://%s/%s.git", dependency.getGroup(), dependency.getArtifactId()));
        clone.setDirectory(context.getWorkspace());
        var git = clone.call();
        context.println("Clone repository to {}", context.getWorkspace().getAbsolutePath());
        return true;
    }
}
