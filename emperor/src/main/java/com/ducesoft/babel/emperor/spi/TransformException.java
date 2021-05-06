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
public class TransformException extends RuntimeException {

    public TransformException(Throwable cause) {
        super(cause);
    }

    public TransformException(String message, Object... args) {
        super(message);
    }

    public TransformException(Throwable cause, String message, Object... args) {
        super(message, cause);
    }
}
