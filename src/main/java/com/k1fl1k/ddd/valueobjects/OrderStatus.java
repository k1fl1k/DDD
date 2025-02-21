package com.k1fl1k.ddd.valueobjects;

public enum OrderStatus {
    NEW,
    CONFIRMED,
    SHIPPED,
    DELIVERED;

    public boolean isCompleted() {
        return this == DELIVERED;
    }
}
