package com.leetcode.recursion;
//509. Fibonacci Number

//recursion needs taking leap of faith and believing the formulae
//because drawing recursion tree is not possible for all cases
//
public class Fibonacci {
    public int fib(int n) {
        if(n<2) return n;
        return fib(n-1)+fib(n-2);

    }
}
