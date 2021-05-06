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
import java.lang.reflect.Modifier;
import java.util.Deque;

/**
 * @author coyzeng@gmail.com
 */
@Data
public class Type implements Serializable {

    @Serial
    private static final long              serialVersionUID = 1677544541472571015L;
    private              String            name;
    private              String            kind;
    private              Modifier          access;
    private              Deque<Annotation> annotations;
    private              Deque<Comment>    comments;
    private              Deque<Variable>   variables;
    private              Deque<Method>     methods;
}
