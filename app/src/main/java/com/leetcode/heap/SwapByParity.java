package com.leetcode.heap;

import java.util.PriorityQueue;

public class SwapByParity {
    public static void main(String[] args) {
        System.out.println(swapByParity(1234));
    }
    public static int swapByParity(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();

        int dummy = num;
        while (dummy > 0) {
            int curr = dummy % 10;
            if (curr % 2 == 0) {
                even.add(curr);
            } else {
                odd.add(curr);
            }
            dummy = dummy / 10;
        }
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int curr = num % 10;
            if (curr % 2 == 0) {
                sb.insert(0, even.poll());
            } else {
                sb.insert(0, odd.poll());
            }
            num = num / 10;
        }
        return Integer.valueOf(sb.toString());
    }
}
