package com.leetcode.hashing;

import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {
        int A[] = {1, 3, 2, 4, 5, 15, 10};
        LongestConsecutive lc = new LongestConsecutive();
        System.out.println(lc.longestConsecutive(A));
    }


    public int longestConsecutive(int[] A) {

        int maxSeq = 1;

        HashSet<Integer> sequences = new HashSet<>();
        for (int i : A) {
            sequences.add(i);
        }
        for (int num : A) {
            int nextInSeq = num + 1;
            int prevInSeq = num - 1;
            int currentSequence = 1;
            while (sequences.remove(prevInSeq--)) {
                currentSequence++;
            }
            while (sequences.remove(nextInSeq++)) {
                currentSequence++;
            }
            if (currentSequence > maxSeq) {
                maxSeq = currentSequence;
            }
        }
        return maxSeq;
    }
}

