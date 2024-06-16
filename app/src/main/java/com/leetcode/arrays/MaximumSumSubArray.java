package com.leetcode.arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        var result2=maxSum(new int[] { -2,1,-3,4,-1,2,1,-5,4,10});
        System.out.println(result2);

    }

    private static int maxSum(int[] nums) {
        int globalMax = 0;
        int localMax = 0;
        for (int i = 0; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }
}
