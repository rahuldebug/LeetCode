package com.leetcode.binarysearch;

public class LastOccurence {
    public static void main(String[] args) {
        int[]arr= {1,2,2,3,4,8,8,8};
        LastOccurence lastOccurence= new LastOccurence();
        System.out.println(lastOccurence.lastOccurence(arr,8));
    }
    int lastOccurence(int arr[], int k) {
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
}
