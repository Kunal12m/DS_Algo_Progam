package com.epam.dsalgo.day4;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class RunLengthEncoding {

    public static void main(String[] args) {
        RunLengthEncoding encoding = new RunLengthEncoding();
        System.out.println(encoding.runLengthEncoding("aaabbbaad"));
        System.out.println(encoding.runLengthEncoding("aabbb"));
        System.out.println(encoding.runLengthEncoding("aabbbaa"));
    }

    public String runLengthEncoding(String input) {
        StringBuilder s = new StringBuilder();
        int length = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                s.append(input.charAt(i - 1)).append(length);
                length = 0;
            }
            length++;
        }
        s.append(input.charAt(input.length() - 1)).append(length);
        return s.toString();
    }
}
