package com.leetcode.matrix;

public class SnakePatternMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        snakePattern(arr);
    }

    private static void snakePattern(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int rev = arr[row].length - 1 - col;
                if (row % 2 == 0) {
                    System.out.println(arr[row][col]);
                } else {
                    System.out.println(arr[row][rev]);
                }
            }
        }

    }


}
