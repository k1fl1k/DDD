package com.k1fl1k.ddd.exceptions;

public class DimensionExceededException extends RuntimeException {

    public DimensionExceededException(String message) {
        super(message);
    }
}