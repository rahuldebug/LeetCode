package com.leetcode.recursion;

public class NcR {

    public static void main (String args[]){
        long result = ncr (5,3);
        System.out.println(result);
    }
// the code can be optimized using memonization , we will look into that later
    private static long ncr(int n, int r) {
        if (n==r || r==0) return 1;
        return ncr(n-1,r-1) +ncr (n-1, r);
    }
}
