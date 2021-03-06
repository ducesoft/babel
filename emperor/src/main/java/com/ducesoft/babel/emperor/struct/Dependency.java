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
public class Dependency implements Serializable {

    @Serial
    private static final long   serialVersionUID = -7136595709543256349L;
    private              String group;
    private              String artifactId;
    private              String version;
    private              String scope;
}
