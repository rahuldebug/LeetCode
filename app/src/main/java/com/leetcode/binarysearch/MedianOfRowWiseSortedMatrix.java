package com.leetcode.binarysearch;

import java.util.Arrays;

public class MedianOfRowWiseSortedMatrix {
    public int median(int matrix[][], int R, int C) {
        //You can code here
        int[] mat=new int[R*C];
        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[k]=matrix[i][j];
                k++;
            }
        }
        Arrays.sort(mat);
        return mat[mat.length/2];
    }
}
