package com.leetcode.stackqueue;

import java.util.ArrayDeque;

//question will be updated later

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "a + b - d";
        System.out.println(infixToPostfix(str));
    }
    public static String infixToPostfix(String infixExpression) {
        //You can code here
        String[] Strings = infixExpression.split(" ");
        StringBuilder result = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String token : Strings) {
            System.out.println(token);
            if (token.equals("(")) {
                stack.push(token);
            }
            if (token.equals(")")) {
                while (!(stack.isEmpty() && !stack.peek().equals("("))) {
                    result.append(stack.pop()).append(" ");;
                }
                stack.pop();
            }
            if (checkSymbol(token)){
                while (stack.peek()!=null){
                  //  assert stack.peek() != null;
                    if (!(precedence(token)<=precedence(stack.peek()))) break;
                    result.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
            else {
                result.append(token).append(" ");
            }

        }
        while (!stack.isEmpty()){
            result.append(stack.pop()).append(" ");
        }
        return result.toString();
    }
    private static boolean checkSymbol(String str) {
        return str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")||str.equals("^");
    }
    private static int precedence(String str){
        switch (str){
            case ("^"):
                return 3;
            case ("*"), ("/"):
                return 2;
            case ("+"), ("-"):
                return 1;

        }

        return 0;
    }
}
