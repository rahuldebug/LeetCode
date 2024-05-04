package com.leetcode.stackqueue;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        BalancedParanthesis bp= new BalancedParanthesis();
        System.out.println(bp.isBalanced("(())("));
    }

    public int isBalanced(String A) {
        //You can code here
        int result=1;
        Stack<Character> stack= new Stack<>();
        if(A.charAt(0)==')') return 0;
        for (int i = 0; i < A.length(); i++) {
            Character ch=A.charAt(i);
            if(ch=='(') stack.push(ch);
            if(ch==')' && stack.isEmpty()) {
                result=0 ;
                break;
            }
            if(ch==')' && !stack.isEmpty()) {
                Character temp=stack.pop();
                if(temp!='(') {
                    result=0;
                    break;
                }
            }
        }

        if(!stack.isEmpty()) result=0;
        return result;
    }
}
