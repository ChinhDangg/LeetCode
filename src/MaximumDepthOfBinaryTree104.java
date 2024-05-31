package src;

import java.util.List;

public class MaximumDepthOfBinaryTree104 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode base3 = new TreeNode(3);
        TreeNode base31 = new TreeNode(4);
        TreeNode base2 = new TreeNode(2, base3, base31);
        TreeNode base33 = new TreeNode(7, new TreeNode(8), new TreeNode(9));
        TreeNode base32 = new TreeNode(6);
        TreeNode base21 = new TreeNode(5, base33, base32);
        TreeNode root = new TreeNode(1, base2, base21);
        System.out.println(maxDepth(root));
    }
}
