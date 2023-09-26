package com.leetcode.tree;

public class TreeNodeDriver {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        //InorderTraversal.inorder(root);
        //PreorderTraversal.preorder(root);
        PostOrderTraversal.postorder(root);
    }
}
