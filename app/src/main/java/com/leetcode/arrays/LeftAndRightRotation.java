package com.leetcode.arrays;
/*
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in a matrix where the ith row represents the rotated array for the ith value in B.

After every rotation, array A becomes equal to the original
*/

/*
A = [1, 2, 3, 4, 5]

B = [3, 2]

Output:

[[4, 5, 1, 2, 3], [3, 4, 5, 1, 2]]

Approach ::
here we will write code just for left and right rotation
*/
public class LeftAndRightRotation {

    public static void main(String[] args) {
        int Arr[] = {1, 2, 3, 4, 5};
        int rotate = 3;
        int[] result = LeftAndRightRotation.leftRotation(Arr, rotate);
        //printResult()
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        //expected answer 4 ,5 ,1 ,2 ,3

        //for right
        // Input: nums = [1,2,3,4,5,6,7], k = 3
        // Output: [5,6,7,1,2,3,4

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int result1[] = LeftAndRightRotation.rightRotation(arr, 3);
        for (int i: result1){
            System.out.print(i+" ");
        }
    }

    static int[] leftRotation(int[] arr, int rotate) {
        int temp[] = new int[arr.length * 2];
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = temp[i + arr.length] = arr[i];
        }
        rotate = rotate % arr.length;
        for (int i = 0; i < arr.length; i++) {
            result[i] = temp[i + rotate];
        }
        return result;
    }

    static int[] rightRotation(int[] arr, int rotate) {
        int temp[] = new int[arr.length * 2];
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = temp[i + arr.length] = arr[i];
        }
        rotate = arr.length - rotate % arr.length;
        for (int i = 0; i < arr.length; i++) {
            result[i] = temp[i + rotate];
        }
        return result;
    }

}
