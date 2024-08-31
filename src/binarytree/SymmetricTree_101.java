package binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class SymmetricTree_101 {
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

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        queue.push(root);
        while (!queue.isEmpty()) {
            TreeNode node_left = queue.removeFirst();
            TreeNode node_right = queue.removeFirst();
            if (node_left == null && node_right == null) continue;
            if (node_left == null || node_right == null) return false;
            if (node_left.val != node_right.val) return false;
            queue.add(node_left.left);
            queue.add(node_right.right);
            queue.add(node_left.right);
            queue.add(node_right.left);
        }
        return true;
    }
}
