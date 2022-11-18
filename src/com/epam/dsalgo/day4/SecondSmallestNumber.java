package com.epam.dsalgo.day4;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class SecondSmallestNumber {

    public static void main(String[] args) {
        int[] input = new int[]{3, 4, 5, 6, 1, 2};
        SecondSmallestNumber smallestNumber = new SecondSmallestNumber();
        System.out.println(smallestNumber.findMin(input));
    }

    public int findMin(int[] a) {
        return Arrays.stream(a).sorted().skip(1).findFirst().orElse(0);
    }
}
