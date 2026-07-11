package com.leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

public class Factorial {
    public static void main(String[] args) {
       System.out.println(Factorial.tail(5));
    }
    
    // 1. Loop (baseline)
    public static long loop(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
     }
    
    // 2. Head Recursion (compute AFTER the call)
    public static long head(int n) { 
        if (n==0||n==1) return 1;
        return n * head(n - 1);
    }
    
    // 3. Tail Recursion (compute BEFORE, use accumulator)
    public static long tail(int n) {
        return tail(n, 1);
    }

    public static long tail(int n, long acc) {
        if (n == 0 || n == 1) return acc;
        return tail(n - 1, acc * n);
    }

}
