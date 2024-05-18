package com.leetcode.arrays;
/*
Max Chunks To Make Sorted
Array
FacebookLyftNutanix
Problem Statement
You are given an integer array A of length n that represents a permutation of the integers in the range [0, n - 1].

We split A into some number of Partitions, and individually sort each chunk. After joining them, the result should equal the sorted array.

Return the largest number of chunks we can make to sort the array.

Example 1:
Input:

[0, 1, 2, 4, 3]

Output:

4

Explanation:

Split into the maximum number of chunks like this: [0], [1], [2], [4, 3]
and sort the individual chunk to sort the whole array.*/
public class MaxChunks {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length==0)return 0;
        int result=0;
        int MaxSoFar=arr[0];
        for(int i=0;i<arr.length;i++){
            MaxSoFar=Math.max(MaxSoFar,arr[i]);

            if(MaxSoFar==i) result++;
        }
        return result;
    }
}
