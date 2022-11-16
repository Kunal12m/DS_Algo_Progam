package com.epam.dsalgo;

import java.util.HashSet;

/**
 * Created by Kunal Mukherjee on 16-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class UniqueTuples {

    public static void main(String[] args) {
        String s = "awaglknagawunagwkwagl";
        int len = 4;
        UniqueTuples uniqueTuples = new UniqueTuples();
        HashSet<String> tuples = uniqueTuples.uniqueTuples(s, len);
        for (String tuple : tuples) {
            System.out.println(tuple);
        }
    }

    public HashSet<String> uniqueTuples(String input, int len) {
        if (input == null) throw new RuntimeException("No String Found");
        HashSet<String> set = new HashSet<>();
        if (len == 0)
            return set;
        for (int i = 0; i < input.length() - len + 1; i++) {
            String s = input.substring(i, i + len);
            if (s.chars().distinct().count() == len) set.add(s);
        }
        return set;
    }

}
