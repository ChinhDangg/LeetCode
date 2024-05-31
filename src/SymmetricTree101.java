package src;

import com.sun.source.tree.Tree;

public class SymmetricTree101 {

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

    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        check(root.left, root.right);
        return symmetric;
    }

    private static boolean symmetric = true;
    public static void check(TreeNode node1, TreeNode node2) {
        if (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                symmetric = false;
                return;
            }
            check(node1.left, node2.right);
            check(node1.right, node2.left);
        }
        else if (node1 != null)
            symmetric = false;
        else if (node2 != null)
            symmetric = false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3), new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4), new TreeNode(3)));
        TreeNode root2 = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}
