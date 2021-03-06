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
public class Method implements Serializable {

    @Serial
    private static final long              serialVersionUID = 8928660153177071089L;
    private              Deque<Parameter>  parameters;
    private              Deque<Return>     returns;
    private              Deque<Comment>    comments;
    private              Deque<Annotation> annotations;
    private              Deque<Expression> expressions;
}
