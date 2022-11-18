package com.epam.dsalgo.day4;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class SmallestNumber {

    public static void main(String[] args) {
        int[] input = new int[]{3, 4, 5, 6, 1, 2};
        SmallestNumber sn = new SmallestNumber();
        System.out.println(sn.findMin(input));
    }

    public int findMin(int[] a) {
        return Arrays.stream(a).min().orElse(0);
    }
}
