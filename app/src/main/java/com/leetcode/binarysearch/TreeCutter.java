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
        int A[] = {4, 42, 40, 26, 46};
        int M = 20;
        int N = A.length;
        TreeCutter treeCutter = new TreeCutter();
        System.out.println(treeCutter.maxHeight(N, A, M));
    }

    public int maxHeight(int N, int[] A, int M) {
        //You can code here
        int low = 0;
        int high = (int) 1e6;
        while (low <= high) {
            System.out.println("low : " + low + " high :"+high );
            int mid = (int) (low + (high - low) / 2);
            int val = cutTree(A, mid);
            System.out.println("val is "+val);
            if (val == M) {
                return mid;
            }
            else if (val < M) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    private int cutTree(int[] a, int mid) {
        int sum = 0;
        for (Integer e : a) {
            if (mid < e) {
                sum += e - mid;
            }
        }
        return sum;
    }
}
