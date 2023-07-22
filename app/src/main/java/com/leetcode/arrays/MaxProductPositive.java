package com.leetcode.arrays;

/*Given the array of integers nums, you will choose two different
indices i and j of that array.
Return the maximum value of (nums[i]-1)*(nums[j]-1).*/
public class MaxProductPositive {
    public int maxProduct(int[] nums) {
        int max=0;
        int second=0;
        for(int num:nums){
            if(num>max){
                int temp=max;
                max=num;
                second= temp;
            }
            else if(num>second){
                second=num;
            }
        }
        return (max-1)*(second-1);

    }
}
