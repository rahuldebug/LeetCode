package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/*Difference Possible
Array
Two Pointers
AtlassianCiscoDE Shaw
Problem Statement
Determine if there are any two distinct indices i and j in the sorted array arr such that
arr[i] - arr[j] equals a non-negative integer k. Return true if possible else false

Input:

arr[] = [1, 1, 1, 2, 2, 6, 8, 8, 8]

k = 2

Output:

true


*/
public class DifferencePossible {
    public static void main(String[] args) {
        DifferencePossible differencePossible= new DifferencePossible();
        int arr[] = {1, 1, 1, 2, 2, 6, 8, 8, 8};
        System.out.println(differencePossible.diffPossible(arr,2));
    }

    public boolean diffPossible(int[] arr, int k)
    {
        Set<Integer> check= new HashSet<>();
        for (int num:arr){
            check.add(num);
        }
        for (int num:arr){
            if(check.contains(num+k)){
                return true;
            }
        } return  false;
    }
}
