package com.leetcode.binarysearch;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        SearchInSortedRotatedArray searchInSortedRotatedArray= new SearchInSortedRotatedArray();
        System.out.println(searchInSortedRotatedArray.search(new int[]{3,1} ,1));
    }
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                ans=mid;
                r=mid-1;
            }
            else if(nums[l]<=nums[mid]){ // left part sorted
                if(nums[l]<=target && target<nums[mid]){
                    r=mid-1;
                } else {
                    l=mid+1;
                }
            } else { //right part sorted
                if(nums[mid]<target && target<=nums[r]){
                    l=mid+1;
                } else {
                    r=mid-1;
                }
            }
        }
        return ans;
    }
}

