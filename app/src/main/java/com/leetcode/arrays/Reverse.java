package com.leetcode.arrays;

public class Reverse {
    public int reverse(int x) {
        long result = 0;
        boolean isneg = false;
        if (x < 0) {
            isneg = true;
            x = -x;
        }
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;
        //return positive ? (int) result : -(int) result;
        return (isneg) ? -(int) result : (int) result;
    }
}

//2147483647
//1.00000