package com.leetcode.sortingsearching;

import java.util.Arrays;

/*
* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
**/
//Moore's voting algorithm

/*Given an array A of N elements. Find the majority element in the array.
A majority element in an array A of size N is an element that appears strictly more than N/2
times in the array.

If no majority exists, return -1.*/
public class MajorityElement {
    public static void main(String[] args) {
        int A[] = {1, 2, 3};

        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(A));
        System.out.println(majorityElement.majorityElement2(A));
    }


    public int majorityElement(int[] nums) {
        int temp = 0;
        Arrays.sort(nums);
        int result = nums[nums.length / 2];
        for (int num : nums) {

            if (num == result) {
                temp++;
            }

        }

        if (temp == (nums.length / 2 + 1)) return result;
        else return -1;
    }

    public int majorityElement2(int[] nums) {
        int count = 1;
        int maxElement = nums[0];
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == maxElement && count != 0) {
                count++;
            } else if (count == 0) {
                maxElement = nums[i];
                count++;
            } else {
                count--;
            }
        }
        for (int num : nums) {

            if (num == maxElement) {
                temp++;
            }

        }
        if (temp == (nums.length / 2 + 1)) return maxElement;
        else return -1;
    }
}