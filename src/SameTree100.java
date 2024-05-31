package src;

public class SameTree100 {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        check(p, q);
        return same;
    }

    private static boolean same = true;
    public static void check(TreeNode node, TreeNode node2) {
        if (node != null && node2 != null) {
            if (node.val != node2.val) {
                same = false;
                return;
            }
            check(node.left, node2.left);
            check(node.right, node2.right);
        }
        else if (node != null)
            same = false;
        else if (node2 != null)
            same = false;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, null, new TreeNode(10, new TreeNode(3, null, null), null));
        TreeNode root2 = new TreeNode(3, null, new TreeNode(10, new TreeNode(3, null, null), null));
        System.out.println(isSameTree(root, root2));

    }


}
