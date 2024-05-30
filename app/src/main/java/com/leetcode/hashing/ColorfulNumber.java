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
                temp.append(num.charAt(j));
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
