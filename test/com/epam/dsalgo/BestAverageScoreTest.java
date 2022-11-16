package com.epam.dsalgo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Kunal Mukherjee on 16-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BestAverageScoreTest {

    private BestAverageScore bestAverageScore;
    private String[][] score;

    @BeforeAll
    public void init() {
        bestAverageScore = new BestAverageScore();
    }

    @Test
    @DisplayName("Test bestAverageGrade Method With Simple Input")
    public void test_best_average_grade_method_with_simple_input() {
        score = new String[][]{{"Sarah", "91"}, {"Goldie", "92"}, {"Elaine", "93"}, {"Elaine", "95"}, {"Goldie", "94"}, {"Sarah", "93"}};
        assertEquals(94, bestAverageScore.bestAverageGrade(score));
    }

    @Test
    @DisplayName("Test bestAverageGrade Method With Simple Input")
    public void test_best_average_grade_method_with_simple_input_1() {
        score = new String[][]{{"Bobby", "87"}, {"Charles", "100"}, {"Eric", "64"}, {"Charles", "22"}};
        assertEquals(87, bestAverageScore.bestAverageGrade(score));
    }

    @Test
    @DisplayName("bestAverageGrade Method Should Return 0 When Input Is Empty")
    public void best_average_grade_method_should_return_0_when_input_is_empty() {
        score = new String[0][0];
        assertEquals(0, bestAverageScore.bestAverageGrade(score));
    }

}
