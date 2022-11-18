package com.epam.dsalgo.day4;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class LongestUniformSubstring {

    public static void main(String[] args) {
        LongestUniformSubstring lus = new LongestUniformSubstring();
        System.out.println(Arrays.toString(lus.getLongestRepeatingSubString("aabbbbbCdAA")));
    }

    public int[] getLongestRepeatingSubString(String s) {
        int start = 0;
        int pre = 0;
        int maxLength = 0;
        int length = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (maxLength < length) {
                    maxLength = length;
                    length = 0;
                    start = pre;
                }
                pre = i;
            }
            length++;
        }
        return new int[]{start, maxLength};
    }
}
