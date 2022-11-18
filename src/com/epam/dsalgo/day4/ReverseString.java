package com.epam.dsalgo.day4;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class ReverseString {

    public static void main(String[] args) {
        ReverseString string = new ReverseString();
        System.out.println(string.reverseString("abcd"));
    }

    public String reverseString(String input) {
        return reverseString(input, input.length() - 1);
    }

    private String reverseString(String input, int length) {
        if (length == 0) return String.valueOf(input.charAt(length));
        return input.charAt(length) + reverseString(input, length - 1);
    }
}