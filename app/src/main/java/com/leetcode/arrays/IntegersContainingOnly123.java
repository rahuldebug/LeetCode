/*
You’re given an array of ‘N’ integers. Your task is to find all those array elements which contain 1, 2, and 3 in their digits and then return them in an array in ascending order. If no element has 1,2 and 3 in its digits, then return an empty array.

Example 1:
Input:

arr = [321, 123, 89, 32, 11]

Output:

[123, 321]
*/

package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegersContainingOnly123 {
    public static void main(String[] args) {
        int[] arr = {123, 16795 ,21321 ,2133331, 7527, 47731, 93354, 2131, 2133, 13720,
                213313 ,69269 ,213 ,96181, 213112, 69016, 23583 ,213232, 32905, 2131221 ,49084
                ,34633 ,42539 ,213112, 21311 ,213112, 60766, 213223, 213 ,79834 ,95366 ,94146,
                213313 ,6437 ,213 ,44322 ,30689, 1451, 2131233 ,21331, 53465, 21947, 2133,
                213, 2133313, 21321 ,21331213 ,78729};
        List<Integer> result = IntegersContainingOnly123.find123Digits(arr, arr.length);
        result.forEach(System.out::println);
    }


    public static List<Integer> find123Digits(int[] arr, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (checkForDigits(arr[i])) {
                result.add(arr[i]);
            }
        }
        Collections.sort(result);

        return result;
    }

    private static boolean checkForDigits(int num) {
        boolean found1 = false;
        boolean found2 = false;
        boolean found3 = false;
        while (num > 0) {

            int temp = num % 10;
            if (temp == 1) found1 = true;
            if (temp == 2) found2 = true;
            if (temp == 3) found3 = true;
            num = num / 10;

//            if (temp == 1 || temp == 2 || temp == 3) {
//
//            } else {
//                return false;
//            }
        }
        return found1 && found2 && found3;
    }
}
