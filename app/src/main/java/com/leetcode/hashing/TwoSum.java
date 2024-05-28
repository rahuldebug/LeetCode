package com.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int N = 6, X = 16;
        int Arr[] = {1, 4, 45, 6, 10, 8};
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.hasArrayTwoCandidates(Arr, N,X));
    }

    public boolean hasArrayTwoCandidates(int arr[], int n, int x) {

        Set<Integer> check = new HashSet<>();
        for (Integer i : arr) {
            check.add(i);
        }
        for (Integer i : arr) {
            if (check.contains(x - i)) return true;
        }
        return false;
    }
}
