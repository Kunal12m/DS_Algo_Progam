package com.epam.dsalgo;

/**
 * Created by Kunal Mukherjee on 21-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class MedianTwoArrays {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3};
        int[] array2 = new int[]{2};
        MedianTwoArrays median = new MedianTwoArrays();
        System.out.println(median.findMedianOfSortedArrays(array1, array2));
    }

    public double findMedianOfSortedArrays(int[] array1, int[] array2) {
        return findMedian(merge(array1, array2));
    }

    private double findMedian(int[] arr) {
        if (arr.length % 2 == 0) {
            return ((double) arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        }
        return arr[arr.length / 2];
    }

    public int[] merge(int[] array1, int[] array2) {
        int[] arr = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                arr[k++] = array1[i++];
            } else {
                arr[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            arr[k++] = array1[i++];
        }
        while (j < array2.length) {
            arr[k++] = array2[j++];
        }
        return arr;
    }
}
