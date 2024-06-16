package com.leetcode.arrays.slidingwindow;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        var result=findSubsting("kyckyckkabcd");
        System.out.println(result);
    }

    private static String findSubsting(String s) {

        String result = "";
        String finalResult = "";
        int lptr = 0;
        int rptr = 0;
        var arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for (rptr = 0; rptr < arr.length; rptr++) {
            if (!set.contains(arr[rptr])) {
                result += arr[rptr];
                set.add(arr[rptr]);
                if (result.length() > finalResult.length()) {
                    finalResult = result;
                }
            } else {
                while (set.contains(arr[rptr])) {
                    result = result.substring(1);
                    set.remove(arr[lptr]);
                    lptr++;
                }
                result+=arr[rptr];
                set.add(arr[rptr]);
            }
        }


        return finalResult;
    }
}
