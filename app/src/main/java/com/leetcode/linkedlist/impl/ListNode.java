package com.leetcode.linkedlist.impl;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x, ListNode node) {
        this.val = x;
        this.next = node;
    }
}