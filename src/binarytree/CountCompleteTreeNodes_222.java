package binarytree;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class CountCompleteTreeNodes_222 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }

    public int countNodes(TreeNode root) {
        int h = height(root);
        return h < 0 ? 0 :
                height(root.right) == h - 1 ? (1 << h) + countNodes(root.right)
                        : (1 << h - 1) + countNodes(root.left);
    }

    public int countNodes_2(TreeNode root) {
        if (root == null)
            return 0;
        int count = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        count++;
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.removeFirst();
                if (node.left != null) {
                    queue.add(node.left);
                    count++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    count++;
                }
            }
        }
        return count;
    }
}
