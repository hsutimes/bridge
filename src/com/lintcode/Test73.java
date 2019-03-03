package com.lintcode;

import sun.reflect.generics.tree.Tree;

/**
 * @author times
 * @file Test73.java
 * @time 2018/10/16 0016
 */
public class Test73 {

    public Test73() {
        int[] inorder = {1, 2, 3}, preorder = {2, 1, 3};
        TreeNode root = buildTree(preorder, inorder);
        root.f(root);
    }

    /**
     * @param inorder:   A list of integers that inorder traversal of a tree
     * @param postorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int instart, int inEnd) {
        if (preStart > preEnd || instart > inEnd) {
            return null;
        }
        int val = preorder[preStart];
        TreeNode root = new TreeNode(val);
        int index = 0;
        for (int i = instart; i <= inEnd; i++) {
            if (val == inorder[i]) {
                index = i;
            }
        }
        int len = index - instart;
        root.left = buildTree(preorder, preStart + 1, preStart + len, inorder, instart, index - 1);
        root.right = buildTree(preorder, preStart + len + 1, preEnd, inorder, index + 1, inEnd);
        return root;
    }

}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    public void f(TreeNode root) {
        if (root == null) return;
        f(root.left);
        f(root.right);
        System.out.print(root.val + " ");
    }
}
