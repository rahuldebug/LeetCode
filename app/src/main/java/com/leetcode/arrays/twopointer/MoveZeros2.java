package com.leetcode.arrays.twopointer;

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
public class MoveZeros2 {
    public static void main(String[] args) {
        MoveZeros2.moveZeros(new int[]{0,0,0,0, 1, 0, 3, 12,0,0,0,0,0,0});
    }

    public static void moveZeros(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[l] = nums[i];
                l++;
            }


        }
        while (l < nums.length) {
            nums[l] = 0;
            l++;
        }
        for (Integer num : nums) {
            System.out.println(num);
        }
    }

}
