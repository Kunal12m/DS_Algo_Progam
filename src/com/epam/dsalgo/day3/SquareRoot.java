package com.epam.dsalgo.day3;

/**
 * Created by Kunal Mukherjee on 17-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(new SquareRoot().squareRoot(23));
        System.out.println(Math.sqrt(23));
    }
    public double squareRoot(int x) {
        double temp;
        double squareRoot = (double) x / 2;
        do {
            temp = squareRoot;
            squareRoot = (temp + (x / temp)) / 2;
        } while ((temp - squareRoot) != 0);

        return squareRoot;
    }
}
