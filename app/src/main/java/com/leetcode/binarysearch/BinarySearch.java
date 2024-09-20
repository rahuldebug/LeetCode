package com.leetcode.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        //binarySearchRecursive()
    }
   static int binarysearch(int arr[], int n, int k) {
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
    static int binarySearchRecursive(int []a , int k , int l, int r){
        //base case
        if(l>r) return -1;
        int mid= l+ (r-l) /2;
        if(a[mid]==k) return mid;
        if(a[mid]<k) return binarySearchRecursive(a,k,mid+1,r);
        else return binarySearchRecursive(a,k,l,mid-1);
    }
}
