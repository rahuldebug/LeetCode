package com.leetcode.arrays.slidingwindow;

/*209. Minimum Size Subarray Sum
leetcode
 sliding window
 */
public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        MinimumSizeSubArraySum minimumSizeSubArraySum= new MinimumSizeSubArraySum();
        System.out.println(
                minimumSizeSubArraySum.minSubArrayLen(7,new int []{2,3,1,2,4,3}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                result = Math.min(result, i + 1 - left);
                sum -= nums[left];
                left++;
            }
        }
        if (result == Integer.MAX_VALUE) return 0;
        return result;
    }
}
