package com.k1fl1k.ddd.exceptions;

public class InvalidMoneyOperationException extends RuntimeException {

    public InvalidMoneyOperationException(String message) {
        super(message);
    }
}
