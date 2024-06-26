package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

public class KthNodeFromMiddle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        KthNodeFromMiddle obj= new KthNodeFromMiddle();
        System.out.println(obj.kthNode(head,2));
    }

    public int kthNode(ListNode head, int B) {
        if (head == null) return -1;
        ListNode dummy = head;
        int len = getLength(dummy);
        if (B > len / 2) return -1;
        ListNode rev = new ReverseLinkedList().reverse(dummy);
        ListNode mid = FindMiddle.middleNode(rev);

        while (B > 0) {
            mid = mid.next;
            B--;
        }
        return mid.val;

    }

    private int getLength(ListNode dummy) {
        int i = 0;
        while (dummy != null) {
            i++;
            dummy = dummy.next;
        }
        return i;
    }

}
