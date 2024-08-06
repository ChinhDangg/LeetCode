package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindModeInBinarySearchTree501 {

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


    public static int[] findMode(TreeNode root) {
        helper(root);
        return modes.stream().mapToInt(i -> i).toArray();
    }

    private static int currentVal;
    private static int currentCount = 0;
    private static int maxCount = 0;
    private static List<Integer> modes = new ArrayList<>();
    public static void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);

        if (root.val != currentVal) {
            currentVal = root.val;
            currentCount = 0;
        }
        currentCount++;
        if (currentCount > maxCount) {
            maxCount = currentCount;
            modes.clear();
            modes.add(currentVal);
        } else if (currentCount == maxCount)
            modes.add(currentVal);

        helper(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        System.out.println(Arrays.toString(findMode(root)));

        currentVal = -1;
        currentCount = 0;
        maxCount = 0;
        modes.clear();
        TreeNode root2 = new TreeNode(0);
        System.out.println(Arrays.toString(findMode(root2)));
    }
}
