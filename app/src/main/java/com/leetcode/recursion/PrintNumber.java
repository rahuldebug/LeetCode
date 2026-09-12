package com.leetcode.recursion;

public class PrintNumber {
public static void main(String[] args) {
    funRev(10);
    foo(3);
}

private static void funRev(int i) {
    // TODO Auto-generated method stub
    if (i>0){
        System.out.println(i);
        funRev(i-1);
        System.out.println(i);
    }
}

private static void foo(int n ){
    if (n>0){
        System.out.println(n);
        foo(n-1);
        foo(n-1);
    }
}
}
