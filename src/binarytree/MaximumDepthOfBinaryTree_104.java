package binarytree;

import java.util.*;

public class MaximumDepthOfBinaryTree_104 {

//    public class TreeNode<T> {
//        private Node<T> root;
//
//        public TreeNode(T rootData) {
//            root = new Node<T>();
//            root.data = rootData;
//            root.children = new ArrayList<Node<T>>();
//        }
//
//        public static class Node<T> {
//            private T data;
//            private Node<T> parent;
//            private List<Node<T>> children;
//        }
//    }

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

    public int maxDepth_BFS(TreeNode root) {
        if (root == null)
            return 0;
        int level = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.removeFirst();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            level += 1;
        }
        return level;
    }

    public int maxDepth_DFS(TreeNode root) {
        Stack<AbstractMap.SimpleEntry<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new AbstractMap.SimpleEntry<>(root, 1));
        int result = 0;
        while (stack.size() != 0) {
            AbstractMap.SimpleEntry<TreeNode, Integer> node = stack.pop();
            int depth = node.getValue();
            if (node != null) {
                result = Math.max(depth, result);
                if (node.getKey().left != null)
                    stack.push(new AbstractMap.SimpleEntry<>(node.getKey().left, depth + 1));
                if (node.getKey().right != null)
                    stack.push(new AbstractMap.SimpleEntry<>(node.getKey().right, depth + 1));
            }
        }
        return result;
    }


    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
