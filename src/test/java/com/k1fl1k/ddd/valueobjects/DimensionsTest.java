package com.k1fl1k.ddd.valueobjects;

import static org.junit.jupiter.api.Assertions.*;

import com.k1fl1k.ddd.exceptions.DimensionExceededException;
import com.k1fl1k.ddd.exceptions.InvalidDimensionException;
import org.junit.jupiter.api.Test;

class DimensionsTest {

    @Test
    void shouldCreateValidDimensions() {
        Dimensions dimensions = new Dimensions(10.0, 5.0, 2.0);
        assertEquals(10.0, dimensions.getLength());
        assertEquals(5.0, dimensions.getWidth());
        assertEquals(2.0, dimensions.getHeight());
    }

    @Test
    void shouldThrowExceptionForNegativeDimensions() {
        assertThrows(InvalidDimensionException.class, () -> new Dimensions(-1.0, 5.0, 2.0));
    }

    @Test
    void shouldThrowExceptionForExceedingMaxDimensions() {
        assertThrows(DimensionExceededException.class, () -> new Dimensions(101.0, 5.0, 2.0));
    }
}
