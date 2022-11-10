package com.epam.dsalgo;

import com.epam.exception.NoArrayFoundException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Kunal Mukherjee on 09-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class SumArrayTest {
    private static Random random;
    private static SumArray sumArray;

    @BeforeAll
    public static void init() {
        random = new Random();
        sumArray = new SumArray();
    }

    @Test
    @DisplayName("Sum of an int Array With Small Input Set in Iterative way")
    void sum_of_an_array_with_small_input_iterative_way() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int sum = Arrays.stream(arr).sum();
        assertEquals(sum, sumArray.sum(arr));
    }

    @Test
    @DisplayName("Sum of an int Array With Small Input Set in Recursive way")
    void sum_of_an_array_with_small_input_recursive_way() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int sum = Arrays.stream(arr).sum();
        assertEquals(sum, sumArray.sum(arr, arr.length - 1));
    }

    @Test
    @DisplayName("Sum of an int Array With large Input Set in Iterative way")
    void sum_of_an_array_with_large_input_iterative_way() {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int sum = Arrays.stream(arr).sum();
        assertEquals(sum, sumArray.sum(arr));
    }

    @Test
    @DisplayName("Sum of an int Array With large Input Set in Recursive way")
    void sum_of_an_array_with_large_input_recursive_way() {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        assertThrows(StackOverflowError.class, () -> sumArray.sum(arr, arr.length - 1));
    }

    @Test
    @DisplayName("Sum method should return 0 if array is empty")
    void sum_method_should_return_0_if_array_is_empty() {
        int[] arr = new int[0];
        assertEquals(0, sumArray.sum(arr));
        assertEquals(0, sumArray.sum(arr, arr.length - 1));
    }

    @Test
    @DisplayName("Sum method should return Exception if array is null")
    void sum_method_should_return_exception_if_array_is_null() {
        assertThrows(NoArrayFoundException.class, () -> sumArray.sum(null));
        assertThrows(NoArrayFoundException.class, () -> sumArray.sum(null, 0));
    }
}
