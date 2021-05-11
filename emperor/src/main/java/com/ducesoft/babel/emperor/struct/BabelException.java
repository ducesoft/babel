/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.struct;

import com.ducesoft.babel.emperor.tool.Format;

/**
 * @author coyzeng@gmail.com
 */
public class BabelException extends RuntimeException {

    public BabelException(Throwable cause) {
        super(cause);
    }

    public BabelException(String message, Object... args) {
        super(Format.string(message, args));
    }

    public BabelException(Throwable cause, String message, Object... args) {
        super(Format.string(message, args), cause);
    }
}
