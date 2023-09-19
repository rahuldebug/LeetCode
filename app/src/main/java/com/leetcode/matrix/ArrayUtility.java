package com.leetcode.matrix;

public class ArrayUtility {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println((find(arr, 9) ? "yes" : "no"));

    }

    private static boolean find(int[][] arr, int i) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == i) return true;

            }
        }
        return false;
    }
    public static void print(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
