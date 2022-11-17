package com.epam.dsalgo;

/**
 * Created by Kunal Mukherjee on 17-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class PowerOf10 {

    /**
     * Returns true if x is a power-of-10. Otherwise returns false
     */
    public static void main(String[] args) {
        int a = 10001;
        System.out.println(new PowerOf10().isPowerOf(a));
    }

    public boolean isPowerOf(int x) {
        return x / 10 == 0;
    }
}
