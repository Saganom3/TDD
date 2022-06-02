package etb.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }

    @Test
    public void testSumPositiveValues_withNegativeValues() {
        int result = calculator.sumPositiveValues(-10, -20, -30);
        assertEquals(result, 0);
    }

//    @Test
//    void testSumPositiveCalues_whithPositiveValues() {
//        int result = calculator.sumPositiveValues(10, 20, 30);
//        assertEquals(result,60);
//    }
}
