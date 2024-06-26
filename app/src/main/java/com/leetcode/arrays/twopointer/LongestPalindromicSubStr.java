package com.leetcode.arrays.twopointer;

//longest Palindromic Substring
public class LongestPalindromicSubStr {
    public static void main(String[] args) {
        LongestPalindromicSubStr obj= new LongestPalindromicSubStr();
        String result = obj.longestPalindrome("cbbd");
        System.out.println(result);

    }

    private  String longestPalindrome(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String result = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            String localResult = "";
            String odd = checkPallindrome(str, i, i);
            String even = checkPallindrome(str, i, i + 1);
            if (odd.length() > even.length()) {
                localResult = odd;
            } else {
                localResult = even;
            }
            if (localResult.length() > result.length()) {
                result = localResult;
            }

        }
        return result;
    }

    private  String checkPallindrome(String str, int left, int right) {
        String result = "";
        while (left >= 0 && right < str.length()
                && str.charAt(left) == str.charAt(right)) {
            if (result.length() < right - left) {
                result = str.substring(left, right + 1);
            }
            left--;
            right++;
        }
        return result;
    }

}
