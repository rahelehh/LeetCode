package binarytree;

import com.sun.source.tree.NewArrayTree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal_105 {

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < preorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int indexOfRoot = inMap.get(root.val);
        root.left = buildTree(preorder, preStart + 1, preStart + indexOfRoot - inStart, inorder, inStart, indexOfRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + indexOfRoot - inStart + 1, preEnd, inorder, indexOfRoot+1, inEnd, inMap);
        return root;
    }
}
