package com.leetcode.matrix;

public class Test2dMatrix {
    static String map[][] = {
            {"rahul", "in"},
            {"rahul", "out"},
            {"nitin", "out"},
            {"nitin", "out"},
            {"pinku", "out"},
            {"pinku", "in"},
    };

    public static void main(String[] args) {
        readMatrix(map);
    }

    private static void readMatrix(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            //  for (int j = 0; j < map[i].length; j++) {
            System.out.println("name :" + map[i][0] + "  entry status : " + map[i][1]);
            // }
        }
    }
}
