package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        if(node.next==null){
            node=null;
            return;
        }
        node.val=node.next.val;
        node.next=node.next.next;

    }
}
