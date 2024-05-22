package com.leetcode.linkedlist;

import com.leetcode.linkedlist.impl.ListNode;

public class BinaryList {
    public ListNode sortBinaryList(ListNode A) {
        //You can code here
        ListNode temp= A;
        int one=0;
        int zero=0;
        while (temp!=null){
            if (temp.val==0) {
                zero++;}
            else{ one++;}
            temp=temp.next;

        }
        ListNode set=A;
        while(zero!=0){
            set.val=0;
            zero--;
            set=set.next;
        }
        while(one!=0){
            set.val=1;
            one--;
            set=set.next;
        }


        return A;


    }
}
