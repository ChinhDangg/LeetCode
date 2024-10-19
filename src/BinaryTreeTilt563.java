package src;

public class BinaryTreeTilt563 {

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

    private static int sum = 0;

    public static int findTilt(TreeNode root) {
        helper(root);
        return sum;
    }

    private static int helper(TreeNode root) {
        if (root == null)
            return 0;

        int left = helper(root.left);
        int right = helper(root.right);
        sum += Math.abs(left - right);
        System.out.println(sum);

        return left + right + root.val;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        //System.out.println(findTilt(root1));

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(findTilt(root));
    }
}
