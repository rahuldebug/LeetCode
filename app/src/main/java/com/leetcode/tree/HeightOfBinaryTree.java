package com.leetcode.tree;

public class HeightOfBinaryTree {
    public static int getHeight(TreeNode node) {
        if (node == null) return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
