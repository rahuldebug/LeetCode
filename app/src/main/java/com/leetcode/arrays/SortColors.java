package com.leetcode.arrays;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*/
public class SortColors {
    public void sortColors(int[] nums) {
        int z = 0;
        int o = 0;
        int t = 0;
        for (int n : nums) {
            if (n == 0) z++;
            if (n == 1) o++;
            if (n == 2) t++;
        }
        for (int i = 0; i <= (z - 1); i++) {
            nums[i] = 0;
        }
        for (int j = z; j <= (o + z - 1); j++) {
            nums[j] = 1;
        }
        for (int k = o + z; k < nums.length; k++) {
            nums[k] = 2;
        }
    }
}
