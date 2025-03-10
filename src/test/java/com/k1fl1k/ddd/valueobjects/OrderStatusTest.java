package com.k1fl1k.ddd.valueobjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderStatusTest {

    @Test
    void shouldCreateValidOrderStatus() {
        OrderStatus status = OrderStatus.valueOf("NEW");
        assertEquals(OrderStatus.NEW, status);
    }

    @Test
    void shouldThrowExceptionForInvalidStatus() {
        assertThrows(IllegalArgumentException.class, () -> OrderStatus.valueOf("INVALID"));
    }
}
