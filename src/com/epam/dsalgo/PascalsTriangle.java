package com.epam.dsalgo;

import java.util.Random;

/**
 * Created by Kunal Mukherjee on 17-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class PascalsTriangle {

    static long[][] pascalsCache;

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(a);
        pascalsCache = new long[a + 1][b + 1];
        PascalsTriangle pt = new PascalsTriangle();
        System.out.printf("Pascal Number for (%d, %d) position is " + pt.pascalTriangle(a, b), a, b);
    }

    public long pascalTriangle(int row, int col) {
        if (col == 0 || col == row) return 1;
        if (pascalsCache[row][col] == 0)
            pascalsCache[row][col] = pascalTriangle(row - 1, col) + pascalTriangle(row - 1, col - 1);
        return pascalsCache[row][col];
    }
}
