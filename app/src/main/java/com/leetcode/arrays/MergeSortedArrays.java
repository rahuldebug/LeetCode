package com.leetcode.arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 0, 0};
        int b[] = {4,5};
        merge(a, 3, b, b.length);
        for (int val : a) {
            System.out.println(val);
        }
    }

    private static void merge(int[] a, int m, int[] b, int n) {
        int aptr = m - 1;
        int bptr = n - 1;
        int index = m + n - 1;
        while (aptr >= 0 && bptr >= 0) {
            if (a[aptr] > b[bptr]) {
                a[index] = a[aptr];
                aptr--;
            } else {
                a[index] = b[bptr];
                bptr--;
            }
            index--;
        }
        while (aptr >= 0) {
            a[index--] = a[aptr--];
        }
        while (bptr >= 0) {
            a[index--] = b[bptr--];
        }
    }
}
