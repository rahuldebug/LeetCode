package com.leetcode.arrays;

// sliding window technique
public class MinimumSubArraySum {
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        MinimumSubArraySum minimumSubArraySum= new MinimumSubArraySum();
        System.out.println(minimumSubArraySum.minSubArrayLen(7, nums));
    }
    public int minSubArrayLen(int K, int[] A) {
        int left = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            while (sum >= K) {
                result = Math.min(result, i - left + 1);
                sum -= A[left];
                left++;
            }
        }
        if (result == Integer.MAX_VALUE) return 0;
        else {
            return result;
        }
    }
}