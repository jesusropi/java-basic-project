package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorShould {
    @Test
    void calculator_plus_returns_two_when_one_plus_one() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.plus(1, 1));
    }
}
