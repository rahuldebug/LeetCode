package com.leetcode.arrays;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int aptr = 0;
        int bptr = 0;
        int max = 0;
        HashSet<Character> check = new HashSet<>();
        while(bptr<s.length()){
            if(!check.contains(s.charAt(bptr))){
                check.add(s.charAt(bptr));
                max= Math.max(max,check.size());
                bptr++;
            }else{
                check.remove(s.charAt(aptr));
                aptr++;
            }
        }return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring ll= new LengthOfLongestSubstring();
        System.out.println( ll.lengthOfLongestSubstring("abcabcbb"));
    }
}
