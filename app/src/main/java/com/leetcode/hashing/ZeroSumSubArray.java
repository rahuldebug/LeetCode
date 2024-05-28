package com.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int arr[]={4, 2 ,0 ,1 ,6};
        //4 2 0 1 6
        System.out.println( findsum(arr, arr.length) );
    }
    public static boolean findsum(int arr[], int n) {
        Set<Integer> check = new HashSet<>();
        long sum = 0;
        for (Integer i : arr) {
            sum += i;
            //if (check.contains(sum)) return true;
            check.add((int) sum);
        }
        return check.size()< arr.length;
    }
}
