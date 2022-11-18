package com.epam.dsalgo.addon;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 16-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class LongestCommonSubsequence {

    static int[][] lcsCache;

    public static void main(String[] args) {
        String a = "avvbclldefghwee";
        String b = "albcssdefgheww";
        lcsCache = new int[a.length() + 1][b.length() + 1];
        for (int[] i : lcsCache)
            Arrays.fill(i, -1);
        System.out.println(lcs(a.length(), b.length(), a, b));
    }

    public static int lcs(int m, int n, String a, String b) {
        if (m == 0 || n == 0) return 0;
        if (lcsCache[m][n] != -1)
            return lcsCache[m][n];
        if (a.charAt(m - 1) == b.charAt(n - 1))
            return lcsCache[m][n] = 1 + lcs(m - 1, n - 1, a, b);

        return lcsCache[m][n] = Math.max(lcs(m - 1, n, a, b), lcs(m, n - 1, a, b));
    }
}
