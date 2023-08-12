package com.leetcode.arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int total = (len * (len + 1)) / 2;
        for (int num : nums) {
            total -= num;
        }
        return total;
    }
}

