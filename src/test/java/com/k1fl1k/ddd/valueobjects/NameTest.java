package com.k1fl1k.ddd.valueobjects;

import static org.junit.jupiter.api.Assertions.*;

import com.k1fl1k.ddd.exceptions.InvalidNameException;
import org.junit.jupiter.api.Test;

class NameTest {

    @Test
    void shouldCreateValidName() {
        Name name = new Name("John", "Doe");
        assertEquals("John", name.getFirstName());
        assertEquals("Doe", name.getLastName());
        assertEquals("John Doe", name.getFullName());
    }

    @Test
    void shouldThrowExceptionForEmptyFirstName() {
        assertThrows(InvalidNameException.class, () -> new Name("", "Doe"));
    }

    @Test
    void shouldThrowExceptionForEmptyLastName() {
        assertThrows(InvalidNameException.class, () -> new Name("John", ""));
    }
}
