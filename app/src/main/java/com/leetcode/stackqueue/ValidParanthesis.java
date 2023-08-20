package com.leetcode.stackqueue;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {

        Stack<Character> check= new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                check.push(s.charAt(i));
            }
            if(check.isEmpty()) return false;
            if(s.charAt(i)==')' && check.pop()!='(') return false;
            if(s.charAt(i)=='}' && check.pop()!='{') return false;
            if(s.charAt(i)==']' && check.pop()!='[') return false;
        }
        return check.isEmpty();
    }
}
