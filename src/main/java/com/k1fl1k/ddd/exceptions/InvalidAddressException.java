package com.k1fl1k.ddd.exceptions;

public class InvalidAddressException extends RuntimeException {

    public InvalidAddressException(String message) {
        super(message);
    }
}
