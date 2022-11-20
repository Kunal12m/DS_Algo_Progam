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
        double a = random.nextDouble() * random.nextInt(1000);
        int n = random.nextInt(10);
        System.out.printf("Compute %f power of %d\n", a, n);
        System.out.println(cp.power(a, n));
    }

    public double power(double a, int n) {
        if (n < 0) {
            n = Math.abs(n);
            a = 1 / a;
        }
        return pow(a, n);
    }

    private double pow(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return pow(a * a, n / 2);
        } else {
            return a * pow(a * a, n / 2);
        }
    }

}
