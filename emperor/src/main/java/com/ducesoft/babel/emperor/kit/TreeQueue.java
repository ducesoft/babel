/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.kit;

import com.ducesoft.babel.emperor.struct.Method;
import com.ducesoft.babel.emperor.struct.Type;
import com.ducesoft.babel.emperor.struct.Variable;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author coyzeng@gmail.com
 */
@Data
public class TreeQueue implements Serializable {

    @Serial
    private static final long            serialVersionUID = 916431267927474996L;
    private final        Queue<Type>     types            = new ArrayDeque<>();
    private final        Queue<Method>   methods          = new ArrayDeque<>();
    private final        Queue<Variable> variables        = new ArrayDeque<>();
}
