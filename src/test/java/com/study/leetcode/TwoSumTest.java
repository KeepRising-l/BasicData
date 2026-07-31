package com.study.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LeetCode 1 两数之和测试
 */
class TwoSumTest {

    @Test
    void basicCase() {
        // [2,7,11,15] target=9 -> 2+7=9，返回 [0,1]
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void reversedIndexOrder() {
        // [3,2,4] target=6 -> 2+4=6，返回下标 [1,2]
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertEquals(2, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void negativeAndZero() {
        // 包含负数：[-3,4,3,90] target=0 -> -3+3=0
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{-3, 4, 3, 90}, 0);
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }
}
