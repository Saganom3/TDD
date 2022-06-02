package etb.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSumPositiveValues_withNegativeValues() {
        int result = calculator.sumPositiveValues(-10, -20, -30);
        assertEquals(0, result);
    }

    @Test
    void testSumNegativeCalues_whithPositiveValues() {
        int result = calculator.sumPositiveValues(10, 20, 30);
        assertEquals(60, result);
    }

    @Test
    void testSumNegativeValues_withNegativeValues() {
        int result = calculator.sumNegativeValues(-10, -20, -30);
        assertEquals(-60, result);
    }

    @Test
    void testSumPositiveCalues_whithPositiveValues() {
        int result = calculator.sumNegativeValues(10, 20, 30);
        assertEquals(0, result);
    }

    @Test
    void testMultValuesCalues_whithPositiveValues() {
        int result = calculator.multValues(10, 20, 30);
        assertEquals(6000, result);
    }

    @Test
    void testRestValuesCalues_whithPositiveValues() {
        int result = calculator.restValues(10, 20, 30);
        assertEquals(-60, result);
    }

    @Test
    void testDivValuesCalues_whithPositiveValues() {
        int result = calculator.divValues(10, 20, 30);
        assertEquals(0, result);
    }
}
