package src;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursive(root, result);
        return result;
    }

    public static void inorderTraversalRecursive(TreeNode node, List<Integer> add) {
        if (node != null) {
            inorderTraversalRecursive(node.left, add);
            add.add(node.val); // replace this before or after left or right recursion to reorder adding order
            inorderTraversalRecursive(node.right, add);
        }
    }

    public static void main(String[] args) {
        TreeNode base3 = new TreeNode(3);
        TreeNode base31 = new TreeNode(4);
        TreeNode base2 = new TreeNode(2, base3, base31);
        TreeNode base32 = new TreeNode(6);
        TreeNode base21 = new TreeNode(5, null, base32);
        TreeNode root = new TreeNode(1, base2, base21);
        List<Integer> result = inorderTraversal(root);
        for (int t : result)
            System.out.println(t);
    }
}
