package com.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int result=0;
        for (int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for (int i=0;i<k;i++){
            result=pq.poll();
        }
        return result;
    }
}
