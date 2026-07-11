package com.leetcode.recursion;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(10, -2));
        System.out.println(divideAndConcqure(10, -3));
    }

    private static double divideAndConcqure(int i, int j) {
       if(j==0) return 1;
       if (j<0) return 1.0 / divideAndConcqurePositive(i, -j);
       else return divideAndConcqurePositive(i, j);
    }

    public static double myPow(double x, int y) {
        if (y == 0) return 1;
        if (x == 0) return 0;
        if (y > 0) return pow(x, y);
        return negPow(x, y);
    }

    private static double pow(double x, int y) {
        // base case
        if (y == 0) return 1;
        // call pow(x, y-1), and do multiplication
        return x * pow(x, y - 1);
    }

    private static double negPow(double x, int y) {
        // base case
        if (y == 0) return 1;
        // call negPow(x, y+1), then divide by x
        return negPow(x, y + 1) / x;
    }
    
    public static double divideAndConcqurePositive(int x , int y)
    {
        //base case
        if(y==0) return 1;
        if (y%2==0){
            return divideAndConcqurePositive(x, y/2) *divideAndConcqurePositive(x, y/2);
        }
        else {
            return divideAndConcqurePositive(x, y/2)*divideAndConcqurePositive(x, y/2)*x;
        }
    }
}
