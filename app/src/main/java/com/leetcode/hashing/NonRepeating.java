package com.leetcode.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class NonRepeating {
    public static void main(String[] args) {
        System.out.println( NonRepeating.nonRepeatingCharacter("mdwfxytmt"));
    }
    public static char nonRepeatingCharacter(String S) {
        //HashSet<Character> ch= new HashSet<>();
        HashMap<Character, Integer> check = new HashMap<>();
        char result = '#';
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (check.containsKey(ch)) {
                check.put(ch, check.get(ch) + 1);
            } else check.put(ch, 1);
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (check.get(ch) == 1) {
                result = ch;
                break;
            }
        }
        return result;
    }
}
