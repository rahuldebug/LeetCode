package com.leetcode.recursion;

public class ReverseString {
    public static void main(String[] args) {
           String str="rahul";
    System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if (str.isBlank()||str.isEmpty()) return "";
        return reverseHelper(str,str.length(),"");

        }

    private static String reverseHelper(String str, int length, String sb) {
            //base case
            if (length ==0) return sb;
            return reverseHelper(str, length-1, sb+str.charAt(length-1));
    }
 

}
