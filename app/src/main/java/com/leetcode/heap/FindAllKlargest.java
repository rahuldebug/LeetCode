package com.leetcode.heap;

import java.util.*;

public class FindAllKlargest {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer num : arr) {
            pq.add(num);
        }
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }
        return result;
    }
}
