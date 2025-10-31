package tests;

import exceptions.MultipleExceptionsDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MultipleExceptionsTest {

    private MultipleExceptionsDemo demo;

    @BeforeEach
    void setup() {
        demo = new MultipleExceptionsDemo();
    }

    @Test
    void testValidInput() {
        assertDoesNotThrow(() -> demo.divideAndAccessArray(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertDoesNotThrow(() -> demo.divideAndAccessArray(10, 0));
    }

    @Test
    void testArrayOutOfBounds() {
        assertDoesNotThrow(() -> demo.divideAndAccessArray(5, 1));
    }

    @Test
    void testNegativeNumbers() {
        assertDoesNotThrow(() -> demo.divideAndAccessArray(-10, 5));
    }

    @Test
    void testGeneralCase() {
        assertDoesNotThrow(() -> demo.divideAndAccessArray(0, 1));
    }
}
