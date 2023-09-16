package com.leetcode.arrays;
//287. Find the Duplicate Number

import java.util.HashSet;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> check= new HashSet<>();
        for(int n:nums){
            if(check.contains(n))return n;
            check.add(n);
        }
        return 0;
    }
}
//It can also be done using fast and slow pointer , will work on that