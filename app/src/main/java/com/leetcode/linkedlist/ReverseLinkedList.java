package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

public class ReverseLinkedList {
    ListNode prev;
    public ListNode reverse(ListNode head){
        while(head!=null){
            ListNode next=head.next;//reference to next node
            head.next=prev; //reversing , pointing to new node
            prev=head; //new node vakue assigned
            head=next; //head pointed to next ref

        }
        return prev;
    }
}
