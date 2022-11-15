package com.epam.dsalgo;

import java.util.Random;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class FibonacciSeries {
    /**
     * FibonacciSeries using Recursion
     * with Dynamic Programming
     */
    int[] fibonacciCache;

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        Random random = new Random();

        int n = random.nextInt(100);
        fs.fibonacciCache = new int[n];

        System.out.println("Fibonacci Series For 1st " + n + "th Element");
        for (int i = 0; i < n; i++)
            System.out.print(fs.fibonacciNumber(i) + " ");
    }

    public int fibonacciNumber(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (fibonacciCache[n] == 0)
            fibonacciCache[n] = fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        return fibonacciCache[n];
    }

}
