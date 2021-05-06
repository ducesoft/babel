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
import java.util.Deque;

/**
 * @author coyzeng@gmail.com
 */
@Data
public class Expression implements Serializable {

    @Serial
    private static final long           serialVersionUID = 2025709834968694736L;
    private              Deque<Comment> comments;
    private              String         access;
    private              String         name;
    private              String         type;
}
