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
        List<Integer> arr = Arrays.stream(input).boxed().collect(Collectors.toList());
        int max = arr.get(0);
        int ans = 0;
        int pre = arr.get(0);
        int curr;
        int length = -1;
        for (int i = 1; i < arr.size(); i++) {
            curr = arr.get(i);
            if (curr >= max) {
                int temp = curr;
                max = curr;
                curr = temp;
            } else
                length++;
            if (length >= 1 && arr.get(i) != 0)
                ans = ans + curr - 1 + length - pre;
            if (max == arr.get(i)) length = -1;
            pre = arr.get(i);
        }

        return ans;
    }
}
