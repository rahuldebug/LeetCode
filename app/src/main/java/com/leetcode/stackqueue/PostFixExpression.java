package com.leetcode.stackqueue;

import java.util.Stack;

public class PostFixExpression {
    public static void main(String[] args) {
        String[] A= {"2", "1", "+", "3", "*"};
        PostFixExpression postFixExpression= new PostFixExpression();
        System.out.println( postFixExpression.evalPostfix(A));
    }
    public int evalPostfix(String[] A) {
        //You can code here
        Stack<Integer> stack = new Stack<>();
        for (String str : A) {
            if (checkSymbol(str)) {
                int sec = stack.pop();
                int first = stack.pop();
                int result = 0;
                switch (str) {
                    case "+":
                        result = first + sec;
                        break;

                    case "-":
                        result = first - sec;
                        break;

                    case "*":
                        result = first * sec;
                        break;
                    case "/":
                        result = first / sec;
                        break;
                }
                stack.push(result);
            }
            else {
                stack.push(Integer.valueOf(str));
            }


        }
        return stack.pop();
    }

    private boolean checkSymbol(String str) {
        return str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*");
    }
}
