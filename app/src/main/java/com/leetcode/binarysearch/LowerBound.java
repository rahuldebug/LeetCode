package com.leetcode.binarysearch;

public class LowerBound {
    public static void main(String[] args) {
        long[]arr={1,2,8,10,11,12,19};
        int n = arr.length;
        int x=5;
        System.out.println( LowerBound.findFloor(arr,n,1));
    }
    public static int findFloor(long arr[], int n, long x)
    {
        int l=0;
        int r=n-1;

        int result=-1;
        while (l<=r){
            int mid =l +  (r - l) /2 ;
            if(arr[mid]<x){
                result = mid;
                l=mid+1;
            } else {
                r=mid-1;
            }
        }

        return result;
    }

}
