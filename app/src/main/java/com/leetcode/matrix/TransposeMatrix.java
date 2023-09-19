package com.leetcode.matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayUtility.print(arr);
        System.out.println(" ");
        ArrayUtility.print(transpose(arr));

    }

    private static int[][] transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row - 1; i++) {
            for (int j = i + 1; j < col; j++) {
                swap(arr, i, j);
            }
        }
        return arr;
    }

    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
