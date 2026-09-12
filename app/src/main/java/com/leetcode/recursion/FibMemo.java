package com.leetcode.recursion;

import java.util.Arrays;

public class FibMemo {

    // ---------- Version 1: naive, for comparison ----------
    static long callsNaive = 0;

    static long fibNaive(int n) {
        callsNaive++;
        if (n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // ---------- Version 2: memoized ----------
    static long callsMemo = 0;

    static long fibMemo(int n, long[] memo) {
        callsMemo++;

        // Step 1: base case — unchanged from the naive version
        if (n <= 1) {
            return n;
        }

        // Step 2: have I already solved this exact subproblem?
        // If yes, return the stored answer and do NO recursion at all.
        if (memo[n] != -1) {
            return memo[n];
        }

        // Step 3: not solved yet, so do the real work
        long result = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);

        // Step 4: write it in the notebook BEFORE returning
        memo[n] = result;

        return result;
    }

    // Wrapper so the caller doesn't have to build the array
    static long fib(int n) {
        long[] memo = new long[n + 1];   // index 0..n
        Arrays.fill(memo, -1);           // -1 means "not computed yet"
        return fibMemo(n, memo);
    }

    public static void main(String[] args) {
        int n = 40;

        long t1 = System.currentTimeMillis();
        long a = fibNaive(n);
        long t2 = System.currentTimeMillis();

        long b = fib(n);
        long t3 = System.currentTimeMillis();

        System.out.println("naive : calls=" + callsNaive + "  time=" + (t2 - t1) + "ms");
        System.out.println("memo  : calls=" + callsMemo  + "  time=" + (t3 - t2) + "ms");
    }
}