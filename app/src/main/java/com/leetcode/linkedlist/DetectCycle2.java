package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

import java.util.HashMap;

//detect cycle and retrun node where cycle starts
public class DetectCycle2 {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> map = new HashMap<>();

        while (head != null) {
            if (map.containsKey(head)) return map.get(head);
            map.put(head, head);

            head = head.next;
        }
        return null;
    }
}
//Floyd's algorithm can also be employed , will work on that