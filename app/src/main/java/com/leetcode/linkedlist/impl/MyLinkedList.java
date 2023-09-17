package com.leetcode.linkedlist.impl;
//Dry run and check again
class MyLinkedList {
    ListNode head;
    int size;


    public MyLinkedList() {
        head = new ListNode(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode cur = head;
        while (index >= 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;

    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        ListNode node = new ListNode(val);
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
        size++;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        ListNode curr = head;

        while (index > 0) {
            curr = curr.next;
            index--;
        }
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */