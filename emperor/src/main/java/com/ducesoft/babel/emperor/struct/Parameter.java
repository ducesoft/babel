/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.struct;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
public class Parameter implements Serializable {

    @Serial
    private static final long   serialVersionUID = -1805025005051265107L;
    private              String name;
    private              Type   type;
}
