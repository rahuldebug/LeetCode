package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

public class HasCycle {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            ListNode slow = head;
            ListNode fast = head;;
            while (fast != null && fast.next != null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)return true;

            }
            return false;
        }
    }

