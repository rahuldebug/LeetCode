package com.leetcode.binarysearch;

public class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        //You can code here
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + r - l / 2;
            if (arr[mid] == k) return mid;

            else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
