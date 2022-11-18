package com.epam.dsalgo.day4;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class Pangram {

    public static void main(String[] args) {
        String s = "The slow purple oryx meanders past the quiescent canine";
        System.out.println(new Pangram().findMissingLetters(s));
    }

    public String findMissingLetters(String input) {
        Set<Character> set = input.chars().mapToObj(e -> (char) Character.toLowerCase(e)).collect(Collectors.toSet());
        StringBuilder ans = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!set.contains(ch))
                ans.append(ch);
        }
        return ans.toString();
    }
}
