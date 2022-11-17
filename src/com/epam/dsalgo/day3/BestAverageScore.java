package com.epam.dsalgo.day3;

import com.epam.exception.NoArrayFoundException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kunal Mukherjee on 16-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class BestAverageScore {

    /**
     * Given a list of student test scores, find the best average grade.
     * Each student may have more than one test score on the list.
     * Complete the bestAverageGrade function in the editor below.
     */

    /**
     * Input: [ [ "Bobby", "87" ], [ "Charles", "100" ], [ "Eric", "64" ], [ "Charles", "22" ] ]
     * Expected output: 87
     */
    public static void main(String[] args) {

        String[][] scores = new String[][]{{"Sarah", "91"}, {"Goldie", "92"}, {"Elaine", "93"}, {"Elaine", "95"}, {"Goldie", "94"}, {"Sarah", "93"}};
        BestAverageScore bas = new BestAverageScore();
        System.out.println(bas.bestAverageGrade(scores));
    }

    public int bestAverageGrade(String[][] scores) {
        if (scores == null) throw new NoArrayFoundException("Provide a String array of arrays");
        if (scores.length == 0) return 0;
        Map<String, String> map = new HashMap<>();
        for (String[] s : scores) {
            if (!map.containsKey(s[0])) map.put(s[0], s[1]);
            else map.put(s[0], map.get(s[0]) + " " + s[1]);
        }
        return map.values().stream().map(e -> {
            String[] s = e.split(" ");
            int sum = 0;
            for (String s1 : s)
                sum += Integer.parseInt(s1);
            return sum / s.length;
        }).mapToInt(e -> e).max().getAsInt();
    }
}
