package com.leetcode.recursion;

public class ReverseString {
    public static void main(String[] args) {
           String str="rahul";
           String s="abcca";
           System.out.println(ispallindrome(0,s.length()-1,s));
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

    private static boolean ispallindrome(int l, int r , String s){
        if (l>=r) return true;
        if (s.charAt(l)!=s.charAt(r)) return false;
        return ispallindrome(l+1,r-1,s);
    }

}
