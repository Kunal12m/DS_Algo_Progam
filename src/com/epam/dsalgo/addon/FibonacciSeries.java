package com.epam.dsalgo.addon;

import java.util.Random;

/**
 * Created by Kunal Mukherjee on 05-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class FibonacciSeries {
    static long[] fibonacciCache;

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        fibonacciCache = new long[n + 1];
        System.out.println(n + " " + fibonacci(5));
    }

    private static long fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        if (fibonacciCache[n] == 0)
            fibonacciCache[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return fibonacciCache[n];
    }
}
