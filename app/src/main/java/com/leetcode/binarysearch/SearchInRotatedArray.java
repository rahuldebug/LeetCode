package com.leetcode.binarysearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        SearchInRotatedArray searchInRotatedArray= new SearchInRotatedArray();
        System.out.println(searchInRotatedArray.search(new int[]{3,1},1));
    }

    public int search(int[] nums, int target) {

        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid= l +(r-l)/2 ;
            if(target==nums[mid])
            {
                ans=mid;
                r=mid-1;
            }
//if left side of array is sorted
            else if(nums[l]<nums[mid]){
                //check if target lies in sorted range of left
                if(nums[l]<=target && nums[mid]>target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
//if left side is not sorted then right side would be sorted as , one side will always be sorted
            else{
                if (nums[mid]<target && nums[r]>=target){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return ans;
    }
}
