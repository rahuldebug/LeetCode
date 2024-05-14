package com.leetcode.binarysearch;

/*
Tree Cutter Problem
Binary Search
Amazon eBay Google Oracle
Problem Statement
Given an array A[] of N integers, where A[i] denotes the height of ith tree.
Geek needs to cut down M meters of wood. He has a woodcutting machine that works as follows:  Set the blade at a height parameter H, and the machine cuts off all trees having a height greater than H. The trees having less than height H remains intact.
Since Geek is an environmentalist, he doesn't want to cut woods more than necessary, so he set the height H as high as possible.
Find the maximum height H of the blade that still allows to cutoff at least M meters of wood.*/
public class TreeCutter {
    public static void main(String[] args) {
        int A[] = {47, 40, 21, 43, 33, 25, 7, 25, 40, 29, 16, 11, 3, 4, 42};
        int M = 25;
        int N = A.length;
        TreeCutter treeCutter = new TreeCutter();
        System.out.println(treeCutter.maxHeight(N, A, M));
    }

    public int getWoodAtCut(int[] A, int cut) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += A[i] > cut ? A[i] - cut : 0;
        }
        return ans;
    }

    public int maxHeight(int N, int[] A, int M) {
        int high = (int) 1e9;
        int low = 0;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalWoodLength = getWoodAtCut(A, mid);
            if (totalWoodLength >= M) {
                result = mid; // Update the result with the current height
                low = mid + 1; // Move towards higher heights
            } else {
                high = mid - 1; // Adjust the height lower
            }
        }
        return result;
    }
}
