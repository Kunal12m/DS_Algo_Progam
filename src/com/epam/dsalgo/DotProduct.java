package com.epam.dsalgo;

/**
 * Created by Kunal Mukherjee on 17-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class DotProduct {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{2, 3};
        System.out.println(new DotProduct().dotProduct(a, b, a.length - 1));
        System.out.println(new DotProduct().dotProduct(a, b));
    }

    /**
     * Dot Product using Iterative Way
     */
    public int dotProduct(int[] a, int[] b) {
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += (a[i] * b[i]);
        }
        return ans;
    }

    /**
     * Dot Product using Recursive Way
     */

    public int dotProduct(int[] a, int[] b, int size) {
        if (size == 0) return a[size] * b[size];
        return a[size] * b[size] + dotProduct(a, b, size - 1);
    }
}
