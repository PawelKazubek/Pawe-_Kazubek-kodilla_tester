package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 1);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult, 1);
    }
    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5;
        double squareResult = calculator.square(a);
        assertEquals(25, squareResult, 1);
    }
}
