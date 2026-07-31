package com.study.leetcode;

/**
 * LeetCode 26 · 删除有序数组中的重复项（Easy）
 *
 * 【题目】
 * 给你一个非严格递增排列的数组 nums，请你原地删除重复出现的元素，
 * 使每个元素只出现一次，返回删除后数组的新长度。
 * 元素的相对顺序应该保持一致。
 *
 * 你必须在【原地】修改输入数组，不能使用额外数组（即空间复杂度 O(1)）。
 *
 * 【示例】
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：返回 5，且 nums 的前 5 个元素被修改为 [0,1,2,3,4]
 *
 * 【考点】
 * 双指针 —— 一个慢指针记录"已去重部分的边界"，一个快指针遍历全数组
 *
 * 【思路提示】
 * - 因为数组有序，重复元素必定相邻
 * - 双指针：
 *   - slow：已去重数组的最后一个位置
 *   - fast：从头往后扫描
 *   - 当 nums[fast] != nums[slow] 时，说明遇到新元素：
 *       先 slow++，再把 nums[fast] 复制到 nums[slow]
 *   - 最终 slow + 1 就是去重后的长度
 *
 * 【易错点】
 * - 返回的是"长度"，不是数组本身；原数组的前部分被原地改写
 * - 开头 slow 从 0 开始，因为第一个元素一定保留
 * - 与你自己写的 MyArray.remove 前移逻辑异曲同工——都是"搬移"
 *
 * 核心实现请你自己写。
 */
public class RemoveDuplicates {

    /**
     * 原地去重，返回新长度
     * @param nums 有序数组（会被原地修改）
     * @return 去重后的长度
     */
    public int removeDuplicates(int[] nums) {
        // TODO 你的实现
        // 思路：快慢双指针。慢指针标记"已去重数组"的最后位置，
        //       快指针扫描全数组，遇到不同元素就前移慢指针并复制。
        // 注意：空数组要直接返回 0；返回的是长度 = 慢指针位置 + 1。
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1 ; fast < nums.length ; fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
