package com.leetcode.binarysearch;

public class UpperBound {
    public static int findCeil(long arr[], int n, long x) {
        int result = arr.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
        int mid=l + (r-l)/2;
        if(arr[mid]>=x){
            result=mid;
            r=mid-1;
        }
        else{
            l=mid+1;
        }

        }
        return result;
    }
}