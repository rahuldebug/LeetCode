package com.leetcode.recursion;

import com.leetcode.recursion.LinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(0);
        Node second = list.head.next = new Node(1);
        Node third = second.next = new Node(3);
        Node curr = list.head;

        list.print();
        list.head = reverseIterative(curr);
        list.print();

        list.head = reverseRecursive(list.head, null);
        list.print();
    }

    private static Node reverseIterative(Node curr) {
        if (curr == null) return curr;
        Node prev = null;
        Node head = curr;
        Node next = null;
        
        while (head != null) {
            next = head.next;   // save the rest of the list before we overwrite head.next
            head.next = prev;   // reverse the pointer: head now points backward
            prev = head;        // prev advances to the node we just reversed
            head = next;        // advance to the previously-saved next node
        }
        // when the loop ends, head is null (that's why it exited) — the new
        // head of the reversed list is prev, the last node we processed
        return prev;
    }

    private static Node reverseRecursive(Node curr, Node prev) {
        // base case: fell off the end of the list — prev is the new head,
        // same as when the while loop's condition (head != null) goes false
        if (curr == null) return prev;

        Node next = curr.next;   // save the rest of the list, same as iterative
        curr.next = prev;        // reverse this node's pointer

        // recurse "forward": curr becomes the new prev, next becomes the new curr
        // — this replaces the loop's prev = head; head = next;
        return reverseRecursive(next, curr);
    }


}
