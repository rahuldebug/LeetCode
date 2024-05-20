package com.leetcode.arrays;

/*
Problem Statement
You are given an integer array arr.

We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array.

Return the largest number of chunks we can make to sort the array.

Example 1:
Input:

arr = [5,4,3,2,1]

Output:

1

Explanation:

Splitting into two or more chunks will not return the required result.
For example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3],
which isn't sorted.*/
//similar to product of array except self



public class ChunksSorted2 {
    public static void main(String[] args) {
        ChunksSorted2 chunksSorted2= new ChunksSorted2();
        int arr[] = {92 ,32};
        System.out.println(chunksSorted2.maxChunksToSorted(arr));
    }
    public int maxChunksToSorted(int[] arr) {
        int chunk = 1;
        int len = arr.length;
        if(len==1||len==2) return chunk;
        int leftMax[] = new int[len];
        int rightMin[] = new int[len];
        leftMax[0] = arr[0];
        rightMin[len - 1] = arr[len - 1];


        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        for (int i = len - 2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i] , rightMin[i + 1]);
        }
        for (int i = 0; i < len - 1; i++) {
            if (leftMax[i] <= rightMin[i + 1]) {
                chunk++;
            }
        }
        return chunk;
    }

}
