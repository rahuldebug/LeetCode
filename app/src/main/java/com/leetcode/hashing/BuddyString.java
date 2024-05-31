package com.leetcode.hashing;

import java.util.Arrays;
/*last 3 problems of homework and Buddystrings  */
public class BuddyString {
    public static void main(String[] args) {
        System.out.println( BuddyString.buddyStrings("ab","ba") );
    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)) {
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)!=s.charAt(i+1))return false;
            }
            return true;
        }
        char[] S=s.toCharArray();
        char[] Goal= goal.toCharArray();
        Arrays.sort(S);
        Arrays.sort(Goal);
        String s1= new String(S);
        String s2= new String(Goal);

        System.out.println(s1);
        System.out.println(s2);
        return s1.equals(s2);
       // return S.toString().equals(Goal.toString());
    }
}
