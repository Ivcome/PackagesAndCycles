
package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest {

    @Test
    public void calculateVacationMonths() {
        VacationCalculator calculator = new VacationCalculator();
        int income = 3000;
        int expenses = 1000;
        int threshold = 5000;

        int result = calculator.calculateVacationMonths(income, expenses, threshold);

        assertEquals(4, result);
    }
}
