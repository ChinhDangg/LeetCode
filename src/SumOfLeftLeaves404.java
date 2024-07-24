package src;

public class SumOfLeftLeaves404 {

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

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null)
            sum += root.left.val;
        else
            sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));

        TreeNode root1 = new TreeNode(1);
        System.out.println(sumOfLeftLeaves(root1));

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.left.right.left = new TreeNode(6);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(6);
        root2.right.right.left = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root2));

    }
}
