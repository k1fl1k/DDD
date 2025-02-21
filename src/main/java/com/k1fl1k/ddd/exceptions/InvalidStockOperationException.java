package com.k1fl1k.ddd.exceptions;

public class InvalidStockOperationException extends RuntimeException {

    public InvalidStockOperationException(String message) {
        super(message);
    }
}
