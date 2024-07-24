package src;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
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

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        helper(root, path, result);
        return result;
    }

    public static void helper(TreeNode node, StringBuilder path, List<String> list) {
        if (node != null) {
            int previousLength = path.length();
            System.out.println(previousLength);
            path.append(node.val);
            if (node.left == null && node.right == null)
                list.add(path.toString());
            else {
                path.append("->");
                helper(node.left, path, list);
                helper(node.right, path, list);
            }
            path.setLength(previousLength);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        TreeNode root2 = new TreeNode(1);
        System.out.println(binaryTreePaths(root));
        //System.out.println(binaryTreePaths(root2));
    }
}
