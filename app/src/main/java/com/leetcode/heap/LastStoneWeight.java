package com.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
    int lastStoneWeight(int[]nums){
        for(int num:nums){
            pq.add(num);
        }
        while (pq.size()>1){
            int a= pq.poll();
            int b= pq.poll();
            if((a-b) !=0){
                pq.add(a-b);
            }
        }
        if(pq.size()==1) return pq.poll();
        return 0;
    }
}
