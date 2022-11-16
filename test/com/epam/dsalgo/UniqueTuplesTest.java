package com.epam.dsalgo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by Kunal Mukherjee on 16-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UniqueTuplesTest {

    private UniqueTuples uniqueTuples;

    @BeforeAll
    public void init() {
        uniqueTuples = new UniqueTuples();
    }

    @Test
    @DisplayName("Test uniqueTuples Method With Normal Method")
    public void test_unique_tuples_method_with_normal_method() {
        String s = "awaglknagawunagwkwagl";
        int len = 4;
        List<String> list = Arrays.asList("aglk", "wagl", "glkn", "lkna", "knag", "gawu", "awun", "wuna", "unag", "nagw", "agwk", "kwag");
        HashSet<String> set = new HashSet<>(list);
        assertEquals(set, uniqueTuples.uniqueTuples(s, len));
    }

    @Test
    @DisplayName("Test uniqueTuples Method With Normal Method 1")
    public void test_unique_tuples_method_with_normal_method_1() {
        String s = "abcabc";
        int len = 3;
        List<String> list = Arrays.asList("abc", "bca", "cab");
        HashSet<String> set = new HashSet<>(list);
        assertEquals(set, uniqueTuples.uniqueTuples(s, len));
    }

    @Test
    @DisplayName("Test uniqueTuples Method With Normal Method 1")
    public void test_unique_tuples_method_with_normal_method_2() {
        String s = "abacab";
        int len = 3;
        List<String> list = Arrays.asList("bac", "cab");
        HashSet<String> set = new HashSet<>(list);
        assertEquals(set, uniqueTuples.uniqueTuples(s, len));
    }

    @Test
    @DisplayName("Test uniqueTuples Method With empty input")
    public void test_unique_tuples_method_with_empty_input() {
        String s = "";
        int len = 0;
        assertEquals(new HashSet<>(), uniqueTuples.uniqueTuples(s, len));
    }

    @Test
    @DisplayName("Test uniqueTuples Method With 0 length")
    public void test_unique_tuples_method_with_0_length() {
        String s = "dewsaf";
        int len = 0;
        assertEquals(new HashSet<>(), uniqueTuples.uniqueTuples(s, len));
    }

    @Test
    @DisplayName("Test uniqueTuples Method With null input")
    public void test_unique_tuples_method_with_null_input() {
        assertThrows(RuntimeException.class, () -> uniqueTuples.uniqueTuples(null, 0));
    }
}
