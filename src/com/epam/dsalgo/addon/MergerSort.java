package com.epam.dsalgo.addon;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kunal Mukherjee on 05-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class MergerSort {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int arrLength = arr.length;

        if (arrLength < 2) return;

        int half = arrLength / 2;
        int[] leftHalf = new int[half];
        int[] rightHalf = new int[arrLength - half];
        System.arraycopy(arr, 0, leftHalf, 0, half);
        System.arraycopy(arr, half, rightHalf, 0, arrLength - half);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftHalf[i] <= rightHalf[j]) arr[k++] = leftHalf[i++];
            else arr[k++] = rightHalf[j++];
        }

        while (i < leftLength) arr[k++] = leftHalf[i++];
        while (j < rightLength) arr[k++] = rightHalf[j++];
    }
}
