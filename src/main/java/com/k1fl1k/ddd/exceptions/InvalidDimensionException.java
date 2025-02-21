package com.k1fl1k.ddd.exceptions;

public class InvalidDimensionException extends RuntimeException {

    public InvalidDimensionException(String message) {
        super(message);
    }
}