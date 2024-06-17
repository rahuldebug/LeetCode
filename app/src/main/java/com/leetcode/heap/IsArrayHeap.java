package com.leetcode.heap;

public class IsArrayHeap {
    // right node = 2*i +2 , which will be the maximum value , hence
    public boolean countSub(long arr[], long n) {

        for (int i = 0; i <= (n - 2) / 2; i++) {
            // If left child is greater, return false
            if (arr[2 * i + 1] > arr[i]) {
                return false;
            }

            // If right child is greater, return false
            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) {
                return false;
            }
        }
        return true;


    }
}
