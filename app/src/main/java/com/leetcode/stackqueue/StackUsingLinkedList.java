package com.leetcode.stackqueue;

public class StackUsingLinkedList {

    class MyStack {
        class StackNode {
            int data;
            StackNode next;
            StackNode(int a) {
                data = a;
                next = null;
            }
        }
        StackNode top;

        boolean isEmpty(){
            return top==null;
        }

        //Function to push an integer into the stack.
        void push(int a) {
            StackNode node= new StackNode(a);
            node.next=top ;
            top=node;

        }

        //Function to remove an item from top of the stack.
        int pop() {
            int result=-1;
            if(!isEmpty()){
                result=top.data;
                top=top.next;
            }
            return result;
        }
    }
}
