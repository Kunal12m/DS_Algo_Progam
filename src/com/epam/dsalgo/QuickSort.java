package com.epam.dsalgo;

import com.epam.exception.NoArrayFoundException;

import java.util.Arrays;
import java.util.Random;

import static com.epam.dsalgo.Util.swap;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class QuickSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(100);

        System.out.println(Arrays.toString(arr));
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] arr) {
        if (arr == null) {
            throw new NoArrayFoundException("No Array Found");
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int pivot = high;
        pivot = getPivot(arr, low, high, pivot);

        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    private int getPivot(int[] arr, int low, int high, int pivot) {
        int left = low, right = high;
        while (left < right) {
            while (arr[pivot] >= arr[left] && left < right) left++;
            while (arr[pivot] <= arr[right] && left < right) right--;

            if (left != right) swap(arr, left, right);
        }
        swap(arr, right, pivot);
        return right;
    }
}
