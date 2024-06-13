package com.leetcode.arrays.twopointer;

/* Question
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
**Example
*/
public class ContainerWithMaximumWater {
    public static void main(String[] args) {
        ContainerWithMaximumWater container = new ContainerWithMaximumWater();
        var result = container.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(result);
    }

    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] < height[right]) {
                result = Math.max(result, (right - left) * height[left]);
                left++;
            } else {
                result = Math.max(result, (right - left) * height[right]);
                right--;
            }

        }
        return result;
    }
}
