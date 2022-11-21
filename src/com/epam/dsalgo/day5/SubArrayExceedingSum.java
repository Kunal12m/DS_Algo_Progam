package com.epam.dsalgo.day5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Kunal Mukherjee on 21-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class SubArrayExceedingSum {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 8, 3, 4};
        int target = 13;
        SubArrayExceedingSum sum = new SubArrayExceedingSum();
        System.out.println(sum.subArrayExceedsSum(array1, target));
    }

    public int subArrayExceedsSum(int[] array1, int target) {
        if (Arrays.stream(array1).sum() < target) return -1;
        else if (Arrays.stream(array1).sum() == target) return array1.length;
        array1 = Arrays.stream(array1).sorted().toArray();
        int count = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            if (array1[i] <= target) {
                target -= array1[i];
                count++;
            }
        }
        return count;
    }
}
