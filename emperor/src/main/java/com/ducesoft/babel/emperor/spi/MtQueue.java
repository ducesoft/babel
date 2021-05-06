/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.spi;

import com.ducesoft.babel.emperor.struct.*;

import java.util.Optional;

/**
 * @author coyzeng@gmail.com
 */
public interface MtQueue {

    Optional<Packet> peekPackage();

    Optional<Type> peekType();

    Optional<Method> peekMethod();

    Optional<Parameter> peekParameter();

    Optional<Return> peekReturn();

    Optional<Variable> peekVariable();

    Optional<Comment> peekComment();

}
