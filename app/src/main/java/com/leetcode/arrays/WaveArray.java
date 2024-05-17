package com.leetcode.arrays;

import java.util.Arrays;

/*Also called as wiggle sort , I have code to sort it in n log n , there is better way to sort it
 * in N . Need to find that .
Example:

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]

NOTE : If there are multiple answers possible, return the one thats lexicographically smallest.
So, in example case, you will return [2, 1, 4, 3]
 *
 * */
public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] result = WaveArray.wiggleSort(arr);
        for (int i : result) {
            System.out.print(i);
        }
    }

    static int[] wiggleSort(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        return arr;
    }
}
