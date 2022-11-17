package com.epam.dsalgo.day2;

import com.epam.exception.NoArrayFoundException;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class MergeSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(1000);

        System.out.println(Arrays.toString(arr));
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void mergeSort(int[] arr) {
        if (arr == null) throw new NoArrayFoundException("No Array Found");
        if (arr.length < 2) return;
        int length = arr.length;
        int half = length / 2;
        int[] leftArr = new int[half];
        int[] rightArr = new int[length - half];
        System.arraycopy(arr, 0, leftArr, 0, half);
        System.arraycopy(arr, half, rightArr, 0, length - half);
        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    public void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;
        int leftLength = leftArr.length;
        int rightLength = rightArr.length;

        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) arr[k++] = leftArr[i++];
            else arr[k++] = rightArr[j++];
        }

        while (i < leftLength) arr[k++] = leftArr[i++];

        while (j < rightLength) arr[k++] = rightArr[j++];
    }
}
