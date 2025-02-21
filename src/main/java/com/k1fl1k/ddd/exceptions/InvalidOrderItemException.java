package com.k1fl1k.ddd.exceptions;

public class InvalidOrderItemException extends RuntimeException {

    public InvalidOrderItemException(String message) {
        super(message);
    }
}
