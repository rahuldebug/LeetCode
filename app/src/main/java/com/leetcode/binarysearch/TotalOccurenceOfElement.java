package com.leetcode.binarysearch;

public class TotalOccurenceOfElement {
    public int count(int[] arr, int n, int x) {
        //You can code here
        int lo=lastOccurence(arr,x);
        if (lo==-1) return 0;
        int fo=firstOccurence(arr,x);
        return lo-fo+1;

    }
    public static int lastOccurence(int arr[], int k) {
        //You can code here
        int l = 0;
        int r = arr.length - 1;
        int result= -1;

        while (l <= r) {

            int mid = l + r - l / 2;

            if (arr[mid] < k) {
                l = mid + 1;
            } else if (arr[mid] > k){
                r = mid - 1;
            }
            else{
                result =mid;
                l=mid+1;
            }
        }

        return result;
    }

    public static int firstOccurence(int arr[], int k) {
        //You can code here
        int l = 0;
        int r = arr.length - 1;
        int result= -1;

        while (l <= r) {

            int mid = l + r - l / 2;

            if (arr[mid] < k) {
                l = mid + 1;
            } else if (arr[mid] > k){
                r = mid - 1;
            }
            else{
                result =mid;
                r=mid-1;
            }
        }

        return result;
    }
}
