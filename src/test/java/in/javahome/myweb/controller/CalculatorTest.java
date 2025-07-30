package in.javahome.myweb.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(10, 5 + 5);
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, 5 - 5);
    }
}

