package com.leetcode.recursion;
//509. Fibonacci Number

import java.util.HashMap;
import java.util.Map;

//recursion needs taking leap of faith and believing the formulae
//because drawing recursion tree is not possible for all cases
//
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.naive(10));
    }
    
    // 1. Naive recursion: brute force
    public static long naive(int n) {
        if (n==0|| n==1) return n;
        int a=0;
        int b=1;
        int toret=0;
        for (int i=2;i<=n;i++){
            toret=a+b;
            a=b;
            b=toret;
        }
        return toret;
    }
    
    // 2. Memoization: cache in HashMap
    public static long memo(int n) {
        Map<Integer, Long> cache = new HashMap<>();
        return memoHelper(n, cache);
    }

    private static long memoHelper(int n, Map<Integer, Long> cache) {
        if (cache.containsKey(n)) return cache.get(n);
        if (n == 0 || n == 1) return n;
        long result = memoHelper(n - 1, cache) + memoHelper(n - 2, cache);
        cache.put(n, result);
        return result;
    }

    // 3. DP: bottom-up, no recursion
    public static long dp(int n) {
        if (n == 0 || n == 1) return n;
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}