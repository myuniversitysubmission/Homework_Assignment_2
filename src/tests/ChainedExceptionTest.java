package tests;

import exceptions.ChainedExceptionDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainedExceptionTest {

    private ChainedExceptionDemo demo;

    @BeforeEach
    void setup() {
        demo = new ChainedExceptionDemo();
    }

    @Test
    void testChainedExceptionThrown() {
        RuntimeException e = assertThrows(RuntimeException.class, () -> demo.performAction());
        assertEquals("Operation failed due to underlying cause", e.getMessage());
        assertNotNull(e.getCause());
    }

    @Test
    void testCauseMessage() {
        try {
            demo.performAction();
        } catch (RuntimeException e) {
            assertEquals("Low-level system failure simulated.", e.getCause().getMessage());
        }
    }

    @Test
    void testTypeOfException() {
        assertThrows(RuntimeException.class, () -> demo.performAction());
    }

    @Test
    void testExceptionHasCause() {
        RuntimeException e = assertThrows(RuntimeException.class, () -> demo.performAction());
        assertTrue(e.getCause() instanceof Exception);
    }

    @Test
    void testActionRepetition() {
        assertThrows(RuntimeException.class, () -> {
            demo.performAction();
            demo.performAction();
        });
    }
}
