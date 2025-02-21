package com.k1fl1k.ddd.exceptions;

public class InvalidNameException extends RuntimeException {

    public InvalidNameException(String message) {
        super(message);
    }
}
