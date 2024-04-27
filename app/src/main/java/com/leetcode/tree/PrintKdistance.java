package com.leetcode.tree;

public class PrintKdistance {
    public static void kdistance(TreeNode node, int k) {
        if (node == null) return;
        if (k == 0) System.out.println(node.val);
        kdistance(node.left, k - 1);
        kdistance(node.right, k - 1);
    }
}
