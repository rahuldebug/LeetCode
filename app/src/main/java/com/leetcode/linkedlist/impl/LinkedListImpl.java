package com.leetcode.linkedlist.impl;

import com.leetcode.linkedlist.impl.ListNode;

public class LinkedListImpl {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        readList(node1);
        readRecurse(node1);

        ListNode head = null;
        for (int i = 0; i < 10; i++) {
            head = insertLast(head, i);
        }
        readRecurse(head);
    }

    static void readList(ListNode head) {

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    static void readRecurse(ListNode head) {
        if (head == null) return;
        System.out.println(head.val);
        readRecurse(head.next);
    }

    static ListNode insertBegin(ListNode head, int x) {
        ListNode temp = new ListNode(x);
        temp.next = head;
        return temp;
    }

    static ListNode insertLast(ListNode head, int x) {
        ListNode temp = new ListNode(x);
        if (head == null) return temp;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

}
