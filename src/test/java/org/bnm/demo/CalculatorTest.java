package org.bnm.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5,3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calc.multiply(5,3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6,3));
    }
}
