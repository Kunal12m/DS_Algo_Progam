package com.epam.dsalgo;

/**
 * Created by Kunal Mukherjee on 08-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class Util {
    public static void swap(int[] arr, int left, int pivot) {
        int temp = arr[left];
        arr[left] = arr[pivot];
        arr[pivot] = temp;
    }
}
