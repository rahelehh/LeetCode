package binarytree;


import java.util.Stack;

public class PathSum_112 {

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

    public boolean hasPathSum_DFS(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        Stack<TreeNode> node_stack = new Stack<>();
        Stack<Integer> sume_stack = new Stack<>();
        node_stack.push(root);
        sume_stack.push(targetSum - root.val);
        while (!node_stack.isEmpty()) {
            TreeNode current_node = node_stack.pop();
            int current_sum = sume_stack.pop();
            if (current_node.left == null && current_node.right == null && current_sum == 0)
                return true;
            if (current_node.left != null) {
                node_stack.push(current_node.left);
                sume_stack.push(current_sum - current_node.left.val);
            }
            if (current_node.right != null) {
                node_stack.push(current_node.right);
                sume_stack.push(current_sum - current_node.right.val);
            }
        }
        return false;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
