package com.epam.dsalgo.day2;

import com.epam.exception.NoArrayFoundException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class InsertionSortTest {
    private static InsertionSort insertionSort;
    private static Random random;

    @BeforeAll
    public static void init() {
        insertionSort = new InsertionSort();
        random = new Random();
    }

    @Test
    @DisplayName("insertionSort Method Sort Small Input Array")
    public void insertionSort_method_sort_small_input_array() {
        int[] inputArr = new int[10];
        for (int i = 0; i < inputArr.length; i++)
            inputArr[i] = random.nextInt(1000);
        int[] sortArr = Arrays.stream(inputArr).sorted().toArray();
        insertionSort.insertionSort(inputArr);
        assertArrayEquals(sortArr, inputArr);
    }

    @Test
    @DisplayName("insertionSort Method Sort Large Input Array")
    public void insertionSort_method_sort_large_input_array() {
        int[] inputArr = new int[100000];
        for (int i = 0; i < inputArr.length; i++)
            inputArr[i] = random.nextInt(10000);
        assertThrows(StackOverflowError.class, () -> insertionSort.insertionSort(inputArr));
    }

    @Test
    @DisplayName("insertionSort Method With Empty Input Array")
    public void insertionSort_method_with_empty_input_array() {
        int[] inputArr = new int[0];
        insertionSort.insertionSort(inputArr);
        assertArrayEquals(new int[0], inputArr);
    }

    @Test
    @DisplayName("insertionSort Method With Null Input Array")
    public void insertionSort_method_with_Null_input_array() {
        assertThrows(NoArrayFoundException.class, () -> insertionSort.insertionSort(null));
    }
}
