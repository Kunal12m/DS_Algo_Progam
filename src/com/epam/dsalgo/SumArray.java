package com.epam.dsalgo;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kunal Mukherjee on 09-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(1000);

        System.out.println(Arrays.toString(arr));

        System.out.println(arraySum(arr));

        System.out.println(arraySum(arr, arr.length-1));

    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static int arraySum(int[] arr, int n) {
        if (n == 0) return arr[n];
        return arr[n] + arraySum(arr, n-1);
    }
}
