package com.leetcode.tree;

public class InorderTraversal {
    public static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.val);
        inorder(node.right);
    }
}
