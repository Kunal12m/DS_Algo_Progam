package com.epam.dsalgo.addon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kunal Mukherjee on 08-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class TripletSum {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 4, 45, 6, 10, 9};
        int[] arr = new int[]{1, 2, 4, 3, 6, 8, 6};     // 12 9 -32 7 3 5
        int x = 13;
        System.out.println(tripletSum(arr, x));
    }

    /**
     * Given an array arr of size n and an integer X.
     * Find if there's a triplet in the array which sums up to the given integer X.
     * Example 1:
     * Input:
     * n = 6, X = 13
     * arr[] = [1 4 45 6 10 8]
     * Output: 1
     * Explanation:
     * The triplet {1, 4, 8} in
     * the array sums up to 13.
     */

    private static int tripletSum(int[] arr, int x) {
        int totalCount = 0;
        List<Integer> singleIntSum = new ArrayList<>();
        List<Integer> twoIntSum = new ArrayList<>();

        singleIntSum.add(x - arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int sum = arr[i] + arr[i - 1];
            if (singleIntSum.contains(sum) || twoIntSum.contains(arr[i])) {
                totalCount += 1;
            }
            for (Integer integer : singleIntSum) {
                twoIntSum.add(integer - arr[i]);
            }
            singleIntSum.add(x - arr[i]);
        }
        return totalCount;
    }
}
