/*
 * Copyright (c) 2000, 2099, ducesoft and/or its affiliates. All rights reserved.
 * DUCESOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 */
package com.ducesoft.babel.golang.grammar;

import org.antlr.v4.runtime.*;

import java.util.List;

/**
 * All parser methods that used in grammar (p, prev, notLineTerminator, etc.)
 * should start with lower case char similar to parser rules.
 *
 * @author coyzeng@gmail.com
 */
public abstract class GoParserBase extends Parser {
    protected GoParserBase(TokenStream input) {
        super(input);
    }

    /**
     * Returns {@code true} iff on the current index of the parser's
     * token stream a token exists on the {@code HIDDEN} channel which
     * either is a line terminator, or is a multi line comment that
     * contains a line terminator.
     *
     * @return {@code true} iff on the current index of the parser's
     * token stream a token exists on the {@code HIDDEN} channel which
     * either is a line terminator, or is a multi line comment that
     * contains a line terminator.
     */
    protected boolean lineTerminatorAhead() {
        // Get the token ahead of the current index.
        int offset                = 1;
        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - offset;

        if (possibleIndexEosToken == -1) {
            return true;
        }

        Token ahead = _input.get(possibleIndexEosToken);

        while (ahead.getChannel() == Lexer.HIDDEN) {
            if (ahead.getType() == GoLexer.TERMINATOR) {
                return true;
            } else if (ahead.getType() == GoLexer.WS) {
                possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - ++offset;
                ahead                 = _input.get(possibleIndexEosToken);
            } else if (ahead.getType() == GoLexer.COMMENT) {
                if (ahead.getText().contains("\r") || ahead.getText().contains("\n")) {
                    return true;
                } else {
                    possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - ++offset;
                    ahead                 = _input.get(possibleIndexEosToken);
                }
            }
        }

        return false;
    }

    /**
     * Returns {@code true} if no line terminator exists between the specified
     * token offset and the prior one on the {@code HIDDEN} channel.
     *
     * @return {@code true} if no line terminator exists between the specified
     * token offset and the prior one on the {@code HIDDEN} channel.
     */
    protected boolean noTerminatorBetween(int tokenOffset) {
        BufferedTokenStream stream = (BufferedTokenStream) _input;
        List<Token>         tokens = stream.getHiddenTokensToLeft(stream.LT(tokenOffset).getTokenIndex());

        if (tokens == null) {
            return true;
        }

        for (Token token : tokens) {
            if (token.getText().contains("\n")) {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns {@code true} if no line terminator exists after any encounterd
     * parameters beyond the specified token offset and the next on the
     * {@code HIDDEN} channel.
     *
     * @return {@code true} if no line terminator exists after any encounterd
     * parameters beyond the specified token offset and the next on the
     * {@code HIDDEN} channel.
     */
    protected boolean noTerminatorAfterParams(int tokenOffset) {
        BufferedTokenStream stream      = (BufferedTokenStream) _input;
        int                 leftParams  = 1;
        int                 rightParams = 0;

        if (stream.LT(tokenOffset).getType() == GoLexer.L_PAREN) {
            // Scan past parameters
            while (leftParams != rightParams) {
                tokenOffset++;
                int valueType = stream.LT(tokenOffset).getType();

                if (valueType == GoLexer.L_PAREN) {
                    leftParams++;
                } else if (valueType == GoLexer.R_PAREN) {
                    rightParams++;
                }
            }

            tokenOffset++;
            return noTerminatorBetween(tokenOffset);
        }

        return true;
    }

    protected boolean checkPreviousTokenText(String text) {
        BufferedTokenStream stream        = (BufferedTokenStream) _input;
        String              prevTokenText = stream.LT(1).getText();

        if (prevTokenText == null) {
            return false;
        }

        return prevTokenText.equals(text);
    }
}
