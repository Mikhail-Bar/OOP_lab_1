package Task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testPositiveValues() {
        assertEquals(0.0, Main.result(1.0, 1.0, 1.0), 0.001);
    }

    @Test
    public void testNegativeValues() {
        assertEquals(0.0, Main.result(-1.0, -1.0, -1.0), 0.001);
    }

    @Test
    public void testZeroDivision() {
        assertThrows(ArithmeticException.class,
                Main.result(1.0, 2.0, 0.0));
    }

    private void assertThrows(Class<ArithmeticException> arithmeticExceptionClass, double result) {
    }
}