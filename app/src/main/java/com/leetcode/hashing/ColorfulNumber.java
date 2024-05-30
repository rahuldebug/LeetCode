package com.leetcode.hashing;

import org.checkerframework.checker.units.qual.C;

import java.util.HashSet;

public class ColorfulNumber {
    public static void main(String[] args) {
        ColorfulNumber colorfulNumber = new ColorfulNumber();
       System.out.println(colorfulNumber.colorful(3757));
    }

    public int colorful(int A) {
        String num = String.valueOf(A);
        HashSet<Integer> check = new HashSet<>();

        for (int i = 0; i < num.length(); i++) {
            int product = 1;
            StringBuilder temp= new StringBuilder();
            for (int j = i; j < num.length(); j++) {
                System.out.println("product at start :"+product);
                temp.append(num.charAt(j));
                System.out.println("product is :"+ product+" * "+ num.charAt(j) );
                product = product * (num.charAt(j));
//                System.out.println("the number is : "+ temp);
//                System.out.println("the product is : "+product);
                if (!check.add(product)) {
                    return 0;
                }
            }

        }

        return 1;
    }
}

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int colorful(int A) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (A != 0) {
            digits.add(A % 10);
            A /= 10;
        }
        Collections.reverse(digits);
        int n = digits.size();
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            int p = 1;
            for (int j = i; j < n; ++j) {
                p *= digits.get(j);
                if (st.contains(p))
                    return 0;
                st.add(p);
            }
        }
        return 1;
    }
}
*/