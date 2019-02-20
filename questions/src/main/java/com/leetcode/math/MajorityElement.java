package com.leetcode.math;

/**
 * 众数问题
 * https://leetcode.com/problems/majority-element/
 *
 * 169. Majority Element
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    /**
     * Boyer-Moore Voting Algorithm
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int target = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (target == nums[i]) {
                count++;
                if (count > nums.length/2) {
                    return target;
                }
            } else {
                count--;
                if (count == 0) {
                    target = nums[i+1];
                }
            }
        }
        return target;
    }
}
