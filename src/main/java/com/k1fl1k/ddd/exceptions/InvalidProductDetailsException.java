package com.k1fl1k.ddd.exceptions;

public class InvalidProductDetailsException extends RuntimeException {

    public InvalidProductDetailsException(String message) {
        super(message);
    }
}
