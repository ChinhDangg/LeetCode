package src;

public class InvertBinaryTree226 {
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

    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        TreeNode root1Inverted = invertTree(root1);
        System.out.println(root1Inverted.val);
        System.out.println(root1Inverted.left.val);
        System.out.println(root1Inverted.right.val);
        System.out.println("------------------------");

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(9);

        TreeNode root2Inverted = invertTree(root2);
        System.out.println(root2Inverted.val);
        System.out.println(root2Inverted.left.val);
        System.out.println(root2Inverted.right.val);
        System.out.println(root2Inverted.left.left.val);
        System.out.println(root2Inverted.left.right.val);
        System.out.println(root2Inverted.right.left.val);
        System.out.println(root2Inverted.right.right.val);
        System.out.println("------------------------");

        TreeNode root3 = new TreeNode(1, new TreeNode(2), null);
        TreeNode root3Inverted = invertTree(root3);
        System.out.println(root3Inverted.val);
        System.out.println(root3Inverted.left);
        System.out.println(root3Inverted.right.val);
    }
}
