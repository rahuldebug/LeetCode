package com.leetcode.recursion;

public class CheckSorted {
    public static void main(String[] args) {
        boolean result=isSorted(new int[]{1,2,3,3,2} , 0);
        System.out.println(result);
    }

    private static boolean isSorted(int[] ints, int i) {
        if (i==ints.length -1) return true;
        if (ints[i+1]<ints[i]) return false;
        return isSorted(ints, i+1 );
    }
}
