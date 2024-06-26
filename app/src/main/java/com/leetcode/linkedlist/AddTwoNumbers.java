package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode toReturn = new ListNode();
        ListNode curr = toReturn;
        int sum = 0;
        int carry = 0;
        while (l1 != null || l2 != null) {

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            curr.next = temp;
            curr = temp;
            sum=0;
        }
        if (carry!=0){
            ListNode temp=new ListNode(carry);
            curr.next=temp;
            curr=temp;
        }
        return toReturn.next;
    }

}
