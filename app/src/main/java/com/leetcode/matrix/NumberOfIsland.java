package com.leetcode.matrix;

public class NumberOfIsland {
    public static void main(String[] args) {
        char grid[][]={
                {'0','1','0','0'},
                {'1','1','1','1'},
                {'0','1','0','0'},
                {'0','1','0','1'}
        };
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;

        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    search(grid, i, j);
                }
            }
        }
        return count;
    }
    public static void search(char[][] grid, int i, int j){
        if(i<0 || i >= grid.length || j<0 ||j>=grid[0].length ||grid[i][j]=='0' ) return ;
        grid[i][j]='0';

        search (grid, i+1,j);
        search (grid, i-1,j);
        search (grid, i,j+1);
        search (grid, i,j-1);

    }
}
