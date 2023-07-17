package com.leetcode.linkedlist;

public class ReverseLinkedList {
    ListNode prev;
    public ListNode reverse(ListNode head){
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;

        }
        return prev;
    }
}
