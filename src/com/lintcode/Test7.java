package com.lintcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author times
 * @file Test7.java
 * @time 2018/7/30 0030
 * @link
 */
public class Test7 {

    public Test7() {
        String data = "1,#,2";
        System.out.println(serialize(deserialize(data)));
    }

    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder s = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode d = q.poll();
            if (d == null) {
                s.append("#,");
            } else {
                s.append(d.val).append(",");
                q.offer(d.left);
                q.offer(d.right);
            }
        }
        return s.substring(0, s.length() - 1).toString();
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] s = data.split(",");
        int i = 0;
        TreeNode root = new TreeNode(Integer.valueOf(s[i]));
        q.offer(root);
        while (!q.isEmpty() && i < s.length - 1) {
            TreeNode p = q.poll();
            i++;
            if (s[i].equals("#")) {
                p.left = null;
            } else {
                TreeNode l = new TreeNode(Integer.valueOf(s[i]));
                p.left = l;
                q.offer(l);
            }
            i++;
            if (s[i].equals("#")) {
                p.right = null;
            } else {
                TreeNode r = new TreeNode(Integer.valueOf(s[i]));
                p.right = r;
                q.offer(r);
            }
        }
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
