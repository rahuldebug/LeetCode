package com.leetcode.arrays;

import java.util.Arrays;

public class MaximumProductThree {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}
