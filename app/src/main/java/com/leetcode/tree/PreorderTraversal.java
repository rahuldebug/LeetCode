package com.leetcode.tree;

public class PreorderTraversal {
    public static void preorder(TreeNode node) {
        if (node == null) return;
        System.out.println(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}
