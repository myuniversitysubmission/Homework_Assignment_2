package tests;

import exceptions.RethrowExceptionDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RethrowExceptionTest {

    private RethrowExceptionDemo demo;

    @BeforeEach
    void setup() {
        demo = new RethrowExceptionDemo();
    }

    @Test
    void testValidData() {
        assertDoesNotThrow(() -> demo.processData("Hello"));
    }

    @Test
    void testNullData() {
        Exception e = assertThrows(NullPointerException.class, () -> demo.processData(null));
        assertEquals("Data cannot be null", e.getMessage());
    }

    @Test
    void testEmptyData() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> demo.processData(""));
        assertEquals("Data cannot be empty", e.getMessage());
    }

    @Test
    void testReThrowBehavior() {
        try {
            demo.processData(null);
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    @Test
    void testMultipleCalls() {
        assertDoesNotThrow(() -> {
            demo.processData("Test1");
            demo.processData("Test2");
        });
    }
}
