package com.leetcode.arrays;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
example ::

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int target){
        if(arr.length==0||arr==null) return new int[] {};
        HashMap<Integer,Integer> map= new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            else {
                map.put(arr[i],i);
            }
        }
        return new int[] {};
    }

}
