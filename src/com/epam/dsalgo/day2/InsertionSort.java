package com.epam.dsalgo.day2;

import com.epam.exception.NoArrayFoundException;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class InsertionSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(1000);

        InsertionSort is = new InsertionSort();
        System.out.println(Arrays.toString(arr));
        is.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        if (arr == null) throw new NoArrayFoundException("No Array Found");
        if (arr.length == 0) return;
        insertionSort(arr, 0, arr.length - 1);
    }

    private void insertionSort(int[] arr, int i, int size) {
        int value = arr[i];
        int j = i;
        while (j > 0 && arr[j - 1] > value) {
            arr[j] = arr[j - 1];
            j--;
        }

        arr[j] = value;

        if (i + 1 <= size) {
            insertionSort(arr, i + 1, size);
        }
    }
}
