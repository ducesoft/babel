/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.emperor.tool;

import com.beust.jcommander.Parameter;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
public class RunArg implements Serializable {

    @Serial
    private static final long    serialVersionUID = -7394051370471873812L;
    @Parameter(names = {"--input", "-input", "-i"}, description = "Input source, cant be repository or file system.")
    private              String  input;
    @Parameter(names = {"--output", "-output", "-o"}, description = "Output source, cant be repository or file system.")
    private              String  output;
    @Parameter(names = {"--include", "-include", "-in"}, description = "Include any source to be processed.")
    private              String  include;
    @Parameter(names = {"--exclude", "-exclude", "-ex"}, description = "Exclude any source to be processed.")
    private              String  exclude;
    @Parameter(names = {"--package", "-package", "-p"}, description = "Output source generic package.")
    private              String  packet;
    @Parameter(names = {"--help", "-help", "-h"}, description = "Usage of babel command.")
    private              boolean help;
    @Parameter(names = {"--version", "-version", "-v"}, description = "Version of babel command.")
    private              boolean version;
}
