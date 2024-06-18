package com.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;

//2558. Take Gifts From the Richest Pile
public class TakeGiftFromRichest {
    public static void main(String[] args) {
        System.out.println(pickGifts(new int[]{25,64,9,4,100},4));
    }
    public static long pickGifts(int[] gifts, int k) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (Integer gift : gifts) {
            pq.offer(gift);
        }
        for (int i = 0; i < k; i++) {
            int maxgift = pq.poll();
            int sqrt = (int) Math.sqrt(maxgift);
            pq.offer(sqrt);
        }
        while (!pq.isEmpty()) result += pq.poll();
        return result;
       // return result;
    }
}
