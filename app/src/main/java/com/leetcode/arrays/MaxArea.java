package com.leetcode.arrays;
/*Container With Most Water
* Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
*
*Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
* In this case, the max area of water (blue section) the container can contain is 49.

* */

public class MaxArea {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int aptr = 0;
        int bptr = height.length - 1;
        int max = 0;
        while (aptr < bptr) {
            if (height[aptr] < height[bptr]) {
                max = Math.max(max, height[aptr] * (bptr - aptr));
                aptr++;
            } else {

                max= Math.max(max,height[bptr]*(bptr-aptr));
                bptr--;
            }

        }
        return max;
    }
/*we move from the side of the smallest height as it cannot give any better result
* than current pair of height , its adjusent might be bigger and hence a better chance
* of bigger max value , similarly we move aptr to right for the search of bigger value*/
}
