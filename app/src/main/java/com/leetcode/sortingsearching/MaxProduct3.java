package com.leetcode.sortingsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxProduct3 {
    public static void main(String[] args) {
        MaxProduct3 maxProduct3= new MaxProduct3();
        ArrayList<Integer>A= new ArrayList<>();
        A.add(0);
        A.add(-1);
        A.add(3);
        A.add(100);
        A.add(70);
        A.add(50);
        System.out.println(maxProduct3.maxProduct3(A));
    }
    public int maxProduct3(ArrayList<Integer> A) {
        //You can code here
        Collections.sort(A);
        return Math.max(A.get(0)*A.get(1)*A.get(A.size()-1), A.get(A.size()-1)*A.get(A.size()-2)*A.get(A.size()-3));



    }
}
