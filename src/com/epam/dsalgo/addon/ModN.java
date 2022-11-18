package com.epam.dsalgo.addon;

/**
 * Created by Kunal Mukherjee on 14-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class ModN {
    public static void main(String[] args) {
        System.out.println(mod10_9_7(3978342, 5));
    }

    /**
     * Mod 10^9 + 7
     */

    public static long mod10_9_7(long a, long b) {
        long result = 1;
        long n = 1000000007;
        while (b > 0) {
            if ((b % 2) != 0)
                result = (result * a % n) % n;

            a = (a % n * a % n) % n;
            b /= 2;
        }
        return result;
    }
}
