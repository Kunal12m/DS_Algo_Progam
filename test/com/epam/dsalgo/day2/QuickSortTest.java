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
public class QuickSortTest {
    private static QuickSort quickSort;
    private static Random random;

    @BeforeAll
    public static void init() {
        quickSort = new QuickSort();
        random = new Random();
    }

    @Test
    @DisplayName("quickSort Method Sort Small Input Array")
    public void quickSort_method_sort_small_input_array() {
        int[] inputArr = new int[10];
        for (int i = 0; i < inputArr.length; i++)
            inputArr[i] = random.nextInt(1000);
        int[] sortArr = Arrays.stream(inputArr).sorted().toArray();
        quickSort.quickSort(inputArr);
        assertArrayEquals(sortArr, inputArr);
    }

    @Test
    @DisplayName("quickSort Method Sort Large Input Array")
    public void quickSort_method_sort_large_input_array() {
        int[] inputArr = new int[100000];
        for (int i = 0; i < inputArr.length; i++)
            inputArr[i] = random.nextInt(10000);
        int[] sortArr = Arrays.stream(inputArr).sorted().toArray();
        quickSort.quickSort(inputArr);
        assertArrayEquals(sortArr, inputArr);
    }

    @Test
    @DisplayName("quickSort Method With Empty Input Array")
    public void quickSort_method_with_empty_input_array() {
        int[] inputArr = new int[0];
        quickSort.quickSort(inputArr);
        assertArrayEquals(new int[0], inputArr);
    }

    @Test
    @DisplayName("quickSort Method With Null Input Array")
    public void quickSort_method_with_Null_input_array() {
        assertThrows(NoArrayFoundException.class, () -> quickSort.quickSort(null));
    }
}
