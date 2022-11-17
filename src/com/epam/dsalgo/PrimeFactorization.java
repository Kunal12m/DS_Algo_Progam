package com.epam.dsalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kunal Mukherjee on 17-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class PrimeFactorization {

    public static void main(String[] args) {
        int[] primeFactor = new PrimeFactorization().primeFactorization(1207650011);
        System.out.println(Arrays.toString(primeFactor));
    }

    public int[] primeFactorization(int x) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i < Math.sqrt(x); i++) {
            while ((x % i) == 0) {
                primeFactors.add(i);
                x /= i;
            }
        }
        int[] ints;
        if (x > 2) {
            ints = new int[primeFactors.size() + 1];
            ints[primeFactors.size()] = x;
        } else ints = new int[primeFactors.size()];
        int k = 0;
        for (Integer integer : primeFactors) {
            ints[k++] = integer;
        }
        return ints;
    }
}
