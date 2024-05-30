package com.leetcode.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BrickWall {
    public static void main(String[] args) {
        BrickWall brickWall = new BrickWall();
        List<List<Integer>> wall = new ArrayList<>();
        List<Integer> one = Arrays.asList(1, 2, 2, 1);
        List<Integer> two = Arrays.asList(3, 1, 2);
        List<Integer> three = Arrays.asList(1, 3, 2);
        List<Integer> four = Arrays.asList(2, 4);
        List<Integer> five = Arrays.asList(3, 1, 2);
        List<Integer> six = Arrays.asList(1, 3, 1, 1);
        wall.add(one);
        wall.add(two);
        wall.add(three);
        wall.add(four);
        wall.add(five);
        wall.add(six);


        System.out.println(brickWall.leastBricks(wall));
    }

    public int leastBricks(List<List<Integer>> wall) {
        //You can code here
        HashMap<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            int sum = 0;
            List<Integer> temp = wall.get(i);

            for (int j = 0; j < temp.size() - 1; j++) {
                System.out.print(" " + sum + " ");
                sum += temp.get(j);
                if (check.containsKey(sum)) {
                    check.put(sum, check.get(sum) + 1);
                } else {
                    check.put(sum, 1);
                }
            }
            System.out.println();
        }
        int size = wall.size();
        System.out.println("size is :: " + size);
        int max = 0;
        for (Integer key : check.keySet()) {
            System.out.println("key is ::" + key + "value is :: " + check.get(key));
            max = Math.max(max, check.get(key));
            // result = Math.min(result, wall.size()-check.get(key));
        }
        return size - max;
    }

}
