package src;

import java.util.*;

public class MinimumAbsoluteDifferenceInBST530 {

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

    // In BST: left node < node < right node; all values are distinct - leverage sorted in-order traversal
    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int check = Math.abs(list.get(i) - list.get(i-1));
            if (check == 1)
                return 1;
            min = Math.min(min, check);
        }
        return min;
    }

    public static void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(getMinimumDifference(root));

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(0);
        root1.right = new TreeNode(48);
        root1.right.left = new TreeNode(12);
        root1.right.right = new TreeNode(49);
        System.out.println(getMinimumDifference(root1));
    }

}
