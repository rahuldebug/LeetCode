package com.leetcode.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 30, 10};
        System.out.println(distinct(arr, arr.length));
        System.out.println(Arrays.stream(arr).distinct().count());
    }

    public static int distinct(int[] arr, int len) {
        Set<Integer> check = new HashSet<>();
        for (Integer e : arr) {
            check.add(e);
        }
        return check.size();
    }

}
