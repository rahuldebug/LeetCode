package com.leetcode.recursion;

public class CountPaths {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        int numberOfPaths= countTotalPath(matrix , 0 , 0);
        System.out.println(numberOfPaths);
    }

    private static int countTotalPath(int[][] matrix , int i , int j) {
        int row = matrix.length;
        int col = matrix[0].length;
        if(i> row-1|| i<0 || j>col-1||j<0) return 0;
        if (i==row-1 && j==col-1)return 1;
        return countTotalPath(matrix,i+1,j) + countTotalPath(matrix,i,j+1);
        //base case

    }
}
