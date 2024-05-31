package src;

public class PathSum112 {

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

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        check(root, targetSum);
        return found;
    }

    private static boolean found = false;
    public static void check(TreeNode node, int targetSum) {
        if (node != null) {
            targetSum -= node.val;

            if (targetSum == 0 && node.left == null && node.right == null) {
                found = true;
                return;
            }

            if (node.left != null && !found)
                check(node.left, targetSum);

            if (node.right != null && !found)
                check(node.right, targetSum);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        int targetSum = -5;

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(-2);
        root2.right = new TreeNode(-3);

        System.out.println(hasPathSum(root2, targetSum));
    }
}
