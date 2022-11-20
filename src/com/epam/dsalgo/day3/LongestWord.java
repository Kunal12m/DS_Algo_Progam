package com.epam.dsalgo.day3;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class LongestWord {
    public static void main(String[] args) {
        String[] strings = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        LongestWord lw = new LongestWord();
        System.out.println(lw.longestWord(strings));
    }

    public String longestWord(String[] strings) {
        return Arrays.stream(strings).max(java.util.Comparator.naturalOrder()).orElse("");
    }
}
