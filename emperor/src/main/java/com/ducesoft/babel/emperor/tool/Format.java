/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author coyzeng@gmail.com
 */
public class Format {

    public static String string(String format, Object... args) {
        var           arguments = Optional.ofNullable(args).stream().flatMap(Arrays::stream).toList();
        StringBuilder pool      = new StringBuilder();
        var           fragments = Optional.ofNullable(format).orElse("").split("\\{}", -1);
        for (int index = 0; index < fragments.length; index++) {
            pool.append(fragments[index]);
            if (index < fragments.length - 1 && arguments.size() > index && null != arguments.get(index)) {
                pool.append(arguments.get(index));
            }
        }
        return pool.toString();
    }
}
