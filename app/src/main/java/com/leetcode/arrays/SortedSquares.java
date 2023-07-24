package com.leetcode.arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int n = len - 1;
        int pt1 = 0;
        int pt2 = n;
        int[] result = new int[len];

        while (pt1 <= pt2) {
            if ((nums[pt1] * nums[pt1]) > (nums[pt2] * nums[pt2])) {
                result[n] = nums[pt1] * nums[pt1];
                pt1++;
            } else {
                result[n] = nums[pt2] * nums[pt2];
                pt2--;
            }
            n--;
        }
        return result;
    }
}
