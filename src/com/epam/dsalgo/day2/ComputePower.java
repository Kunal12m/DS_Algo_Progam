package com.epam.dsalgo.day2;

import java.util.Random;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class ComputePower {
    public static void main(String[] args) {
        ComputePower cp = new ComputePower();
        Random random = new Random();
        int a = random.nextInt(1000);
        int n = random.nextInt(10);
        System.out.printf("Compute %d power of %d\n", a, n);
        System.out.println(cp.power(a, n));
        System.out.println(cp.newPower(a, n));
    }

    public double power(int a, int n) {
        if (n <= 0) return 1;
        return a * power(a, n - 1);
    }

    public double newPower(int a, int n) {
        if (n <= 0) return 1;
        if ((n & 1) == 0)
            return newPower(a, n / 2) * newPower(a, n / 2);
        else
            return a * newPower(a, (n - 1) / 2) * newPower(a, (n - 1) / 2);
    }
}
