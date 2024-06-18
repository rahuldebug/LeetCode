package com.leetcode.heap;

import java.util.PriorityQueue;
/*There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths.
The task is to connect the ropes with minimum cost. Given N size array arr[] contains the lengths of the ropes.*/
public class MinimumCostNropes {
    public static void main(String[] args) {
        var result = minCost(new long[]{4, 2, 7, 6, 9}, 4);
        System.out.println(result);
    }

    static long minCost(long arr[], int n) {
        if (arr == null || arr.length == 0) return 0;
        long cost = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long rope : arr) {
            pq.add(rope);
        }
        while (pq.size() > 1) {
            long curr = pq.poll() + pq.poll();
            pq.add(curr);
            cost += curr;

        }

        return cost;
    }
}
