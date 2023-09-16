package com.leetcode.linkedlist.impl;

import com.leetcode.linkedlist.DeleteNode;

public class LinkedListDriver {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        DeleteNode deleteNode = new DeleteNode();
        deleteNode.deleteNode(head.next.next.next);
        print(head);

    }

    private static void print(ListNode head) {
        while (head!= null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
