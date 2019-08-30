package com.leetcode.dp;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

    // dp[j] = dp[j] + nums[i]
    public int maxSubArray(int[] nums) {
        int dp[] = new int [nums.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i; j >= 0; --j) {
                dp[j] = dp[j] + nums[i];
                if (dp[j] > max) {
                    max = dp[j];
                }
            }
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int max = nums[0], sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    void show(int dp[]) {
        for (int i = 0; i < dp.length; ++i) {
            System.out.printf("" + dp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int a[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("" + maximumSubarray.maxSubArray2(a));
    }
}
