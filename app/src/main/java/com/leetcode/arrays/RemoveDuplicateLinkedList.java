package com.leetcode.arrays;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateLinkedList {


    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(3);

        removeDuplicates(l1);
        System.out.println(l1);

    }

    private static void removeDuplicates(List<Integer> l1) {
        int index = 0;
        int len = l1.size();
        for (int i = 1; i < len; i++) {
            if (l1.get(index) != l1.get(i)) {
                index++;
                l1.set(index, l1.get(i));

            }
        }
        for(int i=l1.size()-1;i>index;i--){
            l1.remove(i);
        }
    }
}
