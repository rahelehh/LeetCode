package binarytree;

import java.util.AbstractMap;
import java.util.Stack;

public class SameTree_100 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

    public boolean isSameTree_DFS(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        Stack<TreeNode> stack_p = new Stack<>();
        Stack<TreeNode> stack_q = new Stack<>();
        stack_p.push(p);
        stack_q.push(q);
        while (!stack_p.isEmpty() && !stack_q.isEmpty()) {
            TreeNode node_p = stack_p.pop();
            TreeNode node_q = stack_q.pop();
            if (node_p.val != node_q.val) return false;
            if (node_p.left != null && node_q.left != null) {
                stack_p.push(node_p.left);
                stack_q.push(node_q.left);
            } else if (node_p.left != null || node_q.left != null) {
                return false;

            }
            if (node_p.right != null && node_q.right != null) {
                stack_p.push(node_p.right);
                stack_q.push(node_q.right);
            }else if (node_p.right != null || node_q.right != null) {
                return false;

            }
        }
        return stack_p.isEmpty() && stack_q.isEmpty();
    }
}
