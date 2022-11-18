package com.epam.dsalgo.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class Snowpack {

    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(new Snowpack().countSnowUnit(input));
    }

    public int countSnowUnit(int[] input) {
        int left = 0, right = input.length - 1;
        int sum = 0;
        int leftMax = 0, rightMax = 0;

        while (left <= right) {
            leftMax = Math.max(input[left], leftMax);
            rightMax = Math.max(input[right], rightMax);
            if (leftMax < rightMax) {
                sum += leftMax - input[left++];
            } else {
                sum += rightMax - input[right--];
            }
        }
        return sum;
    }
}
