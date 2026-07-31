package com.study.leetcode;

import java.util.HashMap;

/**
 * LeetCode 1 · 两数之和（Easy）
 *
 * 【题目】
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案，且同一个元素不能使用两次。
 * 你可以按任意顺序返回答案。
 *
 * 【示例】
 * 输入：nums = [2, 7, 11, 15], target = 9
 * 输出：[0, 1]     因为 nums[0] + nums[1] == 9
 *
 * 【考点】
 * 哈希表（HashMap）—— 把"找补数"从 O(n) 遍历降到 O(1) 查询
 *
 * 【思路提示】
 * - 方法一：暴力两层循环，O(n²)，朴素但能过
 * - 方法二（推荐）：一遍遍历，边遍历边把"已见过的数"存入 HashMap
 *   对每个元素 nums[i]，看 target - nums[i]（补数）是否已在 map 里
 *   - 在：直接返回 [map.get(补数), i]
 *   - 不在：把当前元素和它的下标放入 map，继续
 *
 * 【易错点】
 * - 不能同一个元素用两次（自己 + 自己 = target 是错误答案）
 *   所以必须是"先查 map 再插入"，顺序反了会错
 * - map 里存的是：值 -> 下标（不是下标 -> 值）
 *
 * 核心实现请你自己写。
 */
public class TwoSum {

    /**
     * 找出两个数之和等于 target 的下标
     * @param nums   整数数组
     * @param target 目标值
     * @return 两个下标组成的数组；找不到返回 null
     */
    public int[] twoSum(int[] nums, int target) {
        // TODO 你的实现：一边遍历，一边用 HashMap 记录已见过的值
        // 提示：
        //   HashMap<Integer, Integer> map = new HashMap<>();
        //   for 每个 i：
        //       int complement = target - nums[i];
        //       如果 map.containsKey(complement) -> return new int[]{map.get(complement), i};
        //       否则 map.put(nums[i], i);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
