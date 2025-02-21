package com.k1fl1k.ddd.valueobjects;

import static org.junit.jupiter.api.Assertions.*;

import com.k1fl1k.ddd.exceptions.InvalidEmailException;
import org.junit.jupiter.api.Test;

class EmailTest {

    @Test
    void shouldCreateValidEmail() {
        Email email = new Email("test@example.com");
        assertEquals("test@example.com", email.getEmail());
    }

    @Test
    void shouldThrowExceptionForInvalidEmail() {
        assertThrows(InvalidEmailException.class, () -> new Email("invalid-email"));
    }
}
