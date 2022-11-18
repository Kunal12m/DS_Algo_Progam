package com.epam.dsalgo.addon;

import java.util.Arrays;
import java.util.Random;

import static com.exercise.Util.swap;

/**
 * Created by Kunal Mukherjee on 06-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10000);
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low >= high) return;
        int pivot = high;
        pivot = getPivot(arr, low, high, pivot);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);

    }

    private static int getPivot(int[] arr, int low, int high, int pivot) {
        int left = low, right = high;

        while (left < right) {
            while (arr[left] <= arr[pivot] && left < right) {
                left++;
            }
            while (arr[right] >= arr[pivot] && left < right) {
                right--;
            }
            if (left != right)
                swap(arr, left, right);
        }
        swap(arr, right, pivot);

        return right;
    }
}
