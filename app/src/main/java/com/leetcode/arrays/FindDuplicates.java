package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

/*
* 442. Find All Duplicates in an Array
Medium
8.9K
316
Companies
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.*/

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(index + 1);

            }
            nums[index] = -nums[index];

        }
        return result;
    }

}
