package com.leetcode.arrays;
/*
* You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.



Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2*/
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int result=0;
        for(int num:nums){
            result=result^num;
        }
        return result;
    }
}
