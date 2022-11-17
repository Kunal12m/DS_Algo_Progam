package com.epam.dsalgo.day1;

import com.epam.exception.NoArrayFoundException;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kunal Mukherjee on 09-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class SumArray {
    public static void main(String[] args) {
        SumArray sumArray = new SumArray();
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(1000);

        System.out.println(Arrays.toString(arr));

        System.out.println(sumArray.sum(arr));

        System.out.println(sumArray.sum(arr, arr.length - 1));

    }

    /**
     * Time Complexity
     * O(n)
     * <p>
     * We should use this iterative approach
     * to solve this if the data set is too large
     */
    public int sum(int[] arr) {
        if (arr == null) throw new NoArrayFoundException("Pass an Array object");
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Time Complexity
     * O(n)
     * <p>
     * Recursive approach may not work for a very large data set.
     * like more then 100000 element in an array
     */
    public int sum(int[] arr, int n) {
        if (arr == null) throw new NoArrayFoundException("Pass an Array object");
        if (arr.length == 0) return 0;
        if (n == 0) return arr[n];
        return arr[n] + sum(arr, n - 1);
    }
}
