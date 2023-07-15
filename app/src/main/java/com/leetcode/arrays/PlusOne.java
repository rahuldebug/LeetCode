package com.leetcode.arrays;

public class PlusOne {
    int[] plusOne(int[] digits) {

        int len = digits.length - 1;
        for (int i = len; i >= 0; i--) {
            if (digits[i] !=9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }

        return digits;
    }
}
