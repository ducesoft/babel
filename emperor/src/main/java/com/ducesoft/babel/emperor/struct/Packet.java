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
public class Packet implements Serializable {

    @Serial
    private static final long            serialVersionUID = 3387035684887843495L;
    private              String          name;
    private              Deque<Comment>  comments;
    private              Deque<Variable> variables;
    private              Deque<Method>   methods;
    private              Deque<Type>     types;
}
