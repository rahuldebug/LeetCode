package com.leetcode.arrays;

//kadane's algorithm
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        int localMax=nums[0];
        int globalMax=nums[0];
        for(int i=1;i<nums.length;i++){
           localMax= Math.max(localMax+nums[i],nums[i]);
           if(localMax>globalMax){
               globalMax=localMax;
           }
        }

        return globalMax;
    }
}
