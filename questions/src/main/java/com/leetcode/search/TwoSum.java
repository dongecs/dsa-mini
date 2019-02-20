package com.leetcode.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * https://leetcode.com/problems/two-sum/
     *
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>(64);
        int[] result = new int[1];
        for (int i = 0; i < nums.length; ++i) {
            if (hashMap.get(nums[i]) != null) {
                result = new int[]{hashMap.get(nums[i]), i};
            } else {
                hashMap.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum app = new TwoSum();
        int[] res = app.twoSum(new int[]{2, 7, 11, 15}, 9);
        Arrays.stream(res).forEach(d -> System.out.print(d));
    }

}
