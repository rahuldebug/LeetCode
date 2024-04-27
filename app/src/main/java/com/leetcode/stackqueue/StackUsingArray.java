package com.leetcode.stackqueue;

public class StackUsingArray {
    class MyStack {
        int top;
        int arr[];

        MyStack() {
            top = -1;
            arr = new int[1000];
        }

        boolean isEmpty(){
            return top==-1;
        }

        boolean isFull(){
            return top==1000;
        }

        void push(int a) {
            if(!isFull()){
                top++;
                arr[top]=a;
            }



        }

        int pop() {

            int result=-1;
            if(!isEmpty()){
                result= arr[top];
                top--;
                // return result ;
            }
            return result;
        }
    }
}
