package com.leetcode.binarysearch;

//search first and last occurence of the given number in an array
public class RangeSearch {
    public static void main(String[] args) {
        RangeSearch rangeSearch = new RangeSearch();
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = rangeSearch.searchRange(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return new int[]{-1, -1};
        int left = searchLeft(nums, target);
        int right = searchRight(nums, target);
        return new int[]{left, right};
    }

    private int searchRight(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            }
            if (nums[mid] == target) {
                result = mid;
                l = mid + 1;
            }


        }

        return result;
    }

    private int searchLeft(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            }
            if (nums[mid] == target) {
                result = mid;
                r = mid - 1;
            }


        }

        return result;
    }
}
