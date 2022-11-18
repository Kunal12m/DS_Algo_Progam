package com.epam.dsalgo.addon;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 16-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class KnapsackDP {

    static int[][] knapsackCache;

    public static void main(String[] args) {
        int[] weight = new int[]{10, 20, 30};
        int[] value = new int[]{60, 100, 120};
        int w = 50;
        knapsackCache = new int[weight.length + 1][w + 1];
        for (int[] i : knapsackCache)
            Arrays.fill(i, -1);
        System.out.println(maxKnapsackAmount(w, weight, value, weight.length));
    }

    public static int maxKnapsackAmount(int w, int[] weight, int[] value, int n) {
        if (w == 0 || n == 0) return 0;

        if (knapsackCache[n][w] != -1)
            return knapsackCache[n][w];

        if (weight[n - 1] > w)
            return knapsackCache[n][w] = maxKnapsackAmount(w, weight, value, n - 1);

        return knapsackCache[n][w] = Math.max(
                value[n - 1] + maxKnapsackAmount(w - weight[n - 1], weight, value, n - 1),
                maxKnapsackAmount(w, weight, value, n - 1));
    }
}
