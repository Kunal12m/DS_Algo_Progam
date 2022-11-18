package com.epam.dsalgo.addon;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kunal Mukherjee on 07-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int value = arr[i];
            while (j >= 0 && value < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
    }
}
