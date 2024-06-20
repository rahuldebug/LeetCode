package com.leetcode.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
/*
* Problem Statement
Given N bags, each bag contains Bi chocolates. There is a kid and a magician. In one unit of time, kid chooses a random bag i, eats Bi chocolates, then the magician fills the ith bag with floor(Bi/2) chocolates.

Find the maximum number of chocolates that kid can eat in A units of time.

NOTE:

floor() function returns the largest integer less than or equal to a given number.
Return your answer modulo 109+7
Example 1:
Input:

A = 3
B = [6, 5]

Output:

14*/
public class MagicianAndChoclates {
    public static void main(String[] args) {
        MagicianAndChoclates magicianAndChoclates= new MagicianAndChoclates();
        var list= Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(magicianAndChoclates.magicianAndChocolates(5,new ArrayList<>(list)));
    }
    public int magicianAndChocolates(int A, ArrayList<Integer> B) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (Integer i : B) {
            pq.add(i);
        }
        for (int i = 0; i < A; i++) {
            int curr = pq.poll();
            result += curr;
            pq.add(curr / 2);
        }
        return result;
    }
}
