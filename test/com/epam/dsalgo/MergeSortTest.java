package com.epam.dsalgo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class MergeSortTest {
    private static MergeSort mergeSort;
    private static Random random;

    @BeforeAll
    public static void init() {
        mergeSort = new MergeSort();
        random = new Random();
    }

    @Test
    @DisplayName("mergeSort Method Sort Small Input Array")
    public void mergeSort_method_sort_small_input_array() {
        int[] inputArr = new int[10];
        for (int i = 0; i < inputArr.length; i++)
            inputArr[i] = random.nextInt(1000);
        int[] sortArr = Arrays.stream(inputArr).sorted().toArray();
        mergeSort.mergeSort(inputArr);
        assertArrayEquals(sortArr, inputArr);
    }

    @Test
    @DisplayName("mergeSort Method Sort Large Input Array")
    public void mergeSort_method_sort_large_input_array() {
        int[] inputArr = new int[100000];
        for (int i = 0; i < inputArr.length; i++)
            inputArr[i] = random.nextInt(10000);
        int[] sortArr = Arrays.stream(inputArr).sorted().toArray();
        mergeSort.mergeSort(inputArr);
        assertArrayEquals(sortArr, inputArr);
    }

    @Test
    @DisplayName("Merge 2 Sorted Array Using Merge Method")
    public void merge_2_sorted_array_using_merge_method() {
        int[] firstArr = new int[20];
        int[] secondArr = new int[30];

        for (int i = 0; i < firstArr.length; i++)
            firstArr[i] = random.nextInt(1000);
        for (int i = 0; i < secondArr.length; i++)
            secondArr[i] = random.nextInt(1000);

        int[] sortedArr = new int[firstArr.length + secondArr.length];
        int[] mergeArr = new int[firstArr.length + secondArr.length];
        System.arraycopy(firstArr, 0, sortedArr, 0, firstArr.length);
        System.arraycopy(secondArr, 0, sortedArr, firstArr.length, secondArr.length);

        sortedArr = Arrays.stream(sortedArr).sorted().toArray();
        firstArr = Arrays.stream(firstArr).sorted().toArray();
        secondArr = Arrays.stream(secondArr).sorted().toArray();

        mergeSort.merge(mergeArr, firstArr, secondArr);

        assertArrayEquals(sortedArr, mergeArr);
    }
}
