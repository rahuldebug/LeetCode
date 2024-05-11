package com.leetcode.binarysearch;

public class FirstOccurence {
    public static void main(String[] args) {
        int[]arr= {1,2,2,3,4,8,8,8};
        FirstOccurence firstOccurence= new FirstOccurence();
        System.out.println(firstOccurence.firstOccurence(arr,8));
    }
    int firstOccurence(int arr[], int k) {
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
