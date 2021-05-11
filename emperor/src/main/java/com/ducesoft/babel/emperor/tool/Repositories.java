/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

import com.ducesoft.babel.emperor.spi.Context;
import com.ducesoft.babel.emperor.spi.Repository;
import com.ducesoft.babel.emperor.struct.Dependency;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.stream.Collectors;

/**
 * @author coyzeng@gmail.com
 */
public record Repositories(List<Repository> repositories) implements Repository {

    @Override
    public boolean accept(Context context, Dependency dependency) throws Throwable {
        var x = Optional.ofNullable(this.repositories).orElseGet(Collections::emptyList);
        for (Repository repository : x) {
            if (repository.accept(context, dependency)) {
                return true;
            }
        }
        return false;
    }

    static Repository findAll() {
        var repositories = ServiceLoader
                .load(Repository.class)
                .stream()
                .map(Provider::get)
                .collect(Collectors.toList());
        return new Repositories(repositories);
    }
}
