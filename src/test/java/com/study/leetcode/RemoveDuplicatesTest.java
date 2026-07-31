package com.study.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LeetCode 26 删除有序数组中的重复项测试
 */
class RemoveDuplicatesTest {

    @Test
    void basicCase() {
        // [0,0,1,1,1,2,2,3,3,4] -> 前 5 个为 [0,1,2,3,4]
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = solution.removeDuplicates(nums);

        assertEquals(5, len);
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(3, nums[3]);
        assertEquals(4, nums[4]);
    }

    @Test
    void alreadyUnique() {
        // 无重复：[1,2,3] 长度保持 3
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = new int[]{1, 2, 3};
        assertEquals(3, solution.removeDuplicates(nums));
    }

    @Test
    void allSame() {
        // 全重复：[1,1,1] -> 长度 1
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = new int[]{1, 1, 1};
        assertEquals(1, solution.removeDuplicates(nums));
    }

    @Test
    void emptyArray() {
        // 空数组 -> 长度 0，不崩
        RemoveDuplicates solution = new RemoveDuplicates();
        assertEquals(0, solution.removeDuplicates(new int[]{}));
    }
}
