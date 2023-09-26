package com.leetcode.tree;

public class PostOrderTraversal {
    public static void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val);
    }
}
