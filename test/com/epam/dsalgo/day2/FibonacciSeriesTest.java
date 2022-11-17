package com.epam.dsalgo.day2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class FibonacciSeriesTest {

    private static FibonacciSeries fibonacciSeries;

    @BeforeAll
    public static void init() {
        fibonacciSeries = new FibonacciSeries();
    }

    @Test
    @DisplayName("Get specific Fibonacci Number")
    public void get_specific_fibonacci_number() {
        int n = 10;
        fibonacciSeries.fibonacciCache = new int[n + 1];
        assertEquals(55, fibonacciSeries.fibonacciNumber(n));
    }

    @Test
    @DisplayName("Get specific Fibonacci Number for Larger Input")
    public void get_specific_fibonacci_number_for_larger_input() {
        int n = 1000;
        fibonacciSeries.fibonacciCache = new int[n + 1];
        assertEquals(1556111435, fibonacciSeries.fibonacciNumber(n));
    }

    @Test
    @DisplayName("FibonacciNumber Method for Negative Input")
    public void fibonacciNumber_method_for_negative_input() {
        int n = -1;
        assertThrows(RuntimeException.class, () -> fibonacciSeries.fibonacciNumber(n));
    }
}
