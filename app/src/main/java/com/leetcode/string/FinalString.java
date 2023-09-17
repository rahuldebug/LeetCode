package com.leetcode.string;
/*Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.*/
public class FinalString {
    StringBuilder sb = new StringBuilder();

    public String finalString(String s) {
        char[] S = s.toCharArray();

        for (char ch : S) {
            if (ch == 'i') {
                sb.reverse();
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
