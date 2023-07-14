package com.leetcode.arrays;

/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

overall a stupid question
 */
public class RemoveDuplicates {
    int removeDuplicates(int nums[]) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index+1;
    }
}
