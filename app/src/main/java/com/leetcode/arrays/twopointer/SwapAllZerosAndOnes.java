package com.leetcode.arrays.twopointer;

public class SwapAllZerosAndOnes {
    public static void main(String[] args) {
        var b = swapzerosOnes(new int[]{1, 0, 1, 1, 0, 0});
        for (int num : b) {
            System.out.println(num);
        }
    }

    private static int[] swapzerosOnes(int a[]) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            while (a[left] < 1) left++;
            while (a[right] > 0) right--;
            swap(left, right, a);
            left++;
            right--;
        }
        return a;
    }

    private static void swap(int left, int right, int[] a) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
