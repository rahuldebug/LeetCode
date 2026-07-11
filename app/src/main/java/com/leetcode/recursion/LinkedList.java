package com.leetcode.recursion;

public class LinkedList {

    Node head;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    int size() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            list.insertLast(i);
        }
        list.print();
        System.out.println("size: " + list.size());
    }

}
