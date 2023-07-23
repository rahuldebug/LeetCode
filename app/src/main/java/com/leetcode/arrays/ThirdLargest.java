package com.leetcode.arrays;

public class ThirdLargest {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean thirdExists = false;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] >= first) {
                first = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != first && nums[i] >= second) {
                second = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != first && nums[i] != second && nums[i] >= third) {
                third = nums[i];
                thirdExists = true;
            }
        }
        if (thirdExists) {
            return third;
        } else {
            return first;
        }

    }
}
