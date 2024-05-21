package com.leetcode.arrays;
/*AtlassianGoogleMicrosoftGoldman Sachs
Problem Statement
Given an integer array A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Output:

Return the total water it is able to trap after raining.

Example 1:
Input:

[1, 2, 1, 2, 1]

 Output:

1

Example 2:
Input:

[1, 5, 3, 5, 2, 1]

 Output:

2

Constraints:
2 <= |A| <= 100000
*/


public class RainWaterTrapping {
    public static void main(String[] args) {
        RainWaterTrapping rainWaterTrapping = new RainWaterTrapping();
        int h[] = {1, 2, 1, 2, 1};
        System.out.println(rainWaterTrapping.trap(h));
    }

    public long trap(int[] h) {
        int len = h.length;
        if (len == 0) return 0;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        leftMax[0] = h[0];
        rightMax[len - 1] = h[len - 1];
        long result = 0;
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(h[i], leftMax[i - 1]);
        }
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(h[i], rightMax[i + 1]);
        }
        for (int i = 0; i < len; i++) {
            result += Math.min(leftMax[i], rightMax[i]) - h[i];
        }
        return result;
    }
}
