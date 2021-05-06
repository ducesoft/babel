/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

import com.ducesoft.babel.emperor.spi.Finer;
import com.ducesoft.babel.emperor.spi.MtQueue;
import com.ducesoft.babel.emperor.struct.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

/**
 * @author coyzeng@gmail.com
 */
@Data
public class SourceTree implements Finer,
                                   MtQueue,
                                   Serializable {

    @Serial
    private static final long            serialVersionUID = 916431267927474996L;
    private final        Deque<Packet>   packages         = new ArrayDeque<>();
    private final        Deque<Type>     types            = new ArrayDeque<>();
    private final        Deque<Method>   methods          = new ArrayDeque<>();
    private final        Deque<Variable> variables        = new ArrayDeque<>();

    @Override
    public Optional<Packet> peekPackage() {
        return Optional.ofNullable(this.packages.peek());
    }

    @Override
    public Optional<Type> peekType() {
        return Optional.ofNullable(this.types.peek());
    }

    @Override
    public Optional<Method> peekMethod() {
        return Optional.ofNullable(this.methods.peek());
    }

    @Override
    public Optional<Parameter> peekParameter() {
        return this.peekMethod().map(Method::getParameters).map(Deque::peek);
    }

    @Override
    public Optional<Return> peekReturn() {
        return this.peekMethod().map(Method::getReturns).map(Deque::peek);
    }

    @Override
    public Optional<Variable> peekVariable() {
        return Optional.ofNullable(this.variables.peek());
    }

    @Override
    public Optional<Comment> peekComment() {
        return this
                .peekMethod()
                .map(Method::getExpressions)
                .map(Deque::peek)
                .map(Expression::getComments)
                .map(Deque::peek)
                .or(() -> this.peekMethod().map(Method::getComments).map(Deque::peek))
                .or(() -> this.peekVariable().map(Variable::getComments).map(Deque::peek))
                .or(() -> this.peekType().map(Type::getComments).map(Deque::peek))
                .or(() -> this.peekPackage().map(Packet::getComments).map(Deque::peek));
    }

    @Override
    public void confinePackage(String group) {
        this.packages.push(new Packet());
    }

    @Override
    public void definePackage(String group) {

    }

    @Override
    public void confineType(String name) {
        this.types.push(new Type());
    }

    @Override
    public void defineType(String name) {

    }

    @Override
    public void confineMethod(String name) {
        this.methods.push(new Method());
    }

    @Override
    public void defineMethod(String name) {

    }

    @Override
    public void confineParameter(String name) {

    }

    @Override
    public void defineParameter(String name) {

    }

    @Override
    public void confineReturn(String name) {

    }

    @Override
    public void defineReturn(String name) {

    }

    @Override
    public void confineVariable(String name) {
        this.variables.push(new Variable());
    }

    @Override
    public void defineVariable(String name) {

    }
}
