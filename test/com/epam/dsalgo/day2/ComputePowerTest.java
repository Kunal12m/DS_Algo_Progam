package com.epam.dsalgo.day2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class ComputePowerTest {

    private static ComputePower computePower;

    @BeforeAll
    public static void init() {
        computePower = new ComputePower();
    }

    @Test
    @DisplayName("Power Method With Simple Input")
    public void calculate_power_with_simple_input() {
        Random random = new Random();
        int a = random.nextInt(1000);
        int n = random.nextInt(10);
        double ans = Math.pow(a, n);
        assertEquals(ans, computePower.power(a, n));
    }

    @Test
    @DisplayName("Power Method With Negative Input")
    public void calculate_power_with_negative_input() {
        Random random = new Random();
        int a = -random.nextInt(1000);
        int n = random.nextInt(10);
        double ans = Math.pow(a, n);
        assertEquals(ans, computePower.power(a, n));
    }

    @Test
    @DisplayName("Power Method With Zero Input")
    public void calculate_power_with_zero_input() {
        int a = 0;
        int n = 0;
        double ans = Math.pow(a, n);
        assertEquals(ans, computePower.power(a, n));
    }

}
