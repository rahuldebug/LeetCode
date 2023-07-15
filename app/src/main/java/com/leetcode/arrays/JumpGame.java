package com.leetcode.arrays;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int currJump=0;
        int maxJump=0;

        for(int i=0;i<nums.length;i++){
            currJump=i+nums[i];
            maxJump=Math.max(currJump,maxJump);
            if(maxJump>=nums.length-1) return true;
            if(maxJump==i)return false;
        }
        return true;
    }
}





