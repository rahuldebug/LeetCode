package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        RemoveDuplicates removeDuplicates= new RemoveDuplicates();
        ListNode result=removeDuplicates.deleteDuplicates(head);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode first = head;
        while (first != null && first.next != null) {
            if (first.val == first.next.val) {
                first.next = first.next.next;
            } else {
                first = first.next;
            }
        }
        return head;
    }
}
