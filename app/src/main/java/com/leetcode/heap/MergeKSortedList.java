package com.leetcode.heap;

import java.util.PriorityQueue;

public class MergeKSortedList {
    public static void main(String[] args) {


    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        for (ListNode l : lists) {
            if (l != null) {
                pq.add(l);
            }
        }
        while (pq.size() != 0) {
            ListNode curr = pq.poll();
            tail.next = curr;
            tail = curr;

            if (curr.next != null) {
                pq.add(curr.next);
            }
        }
        return dummy.next;
    }
}
