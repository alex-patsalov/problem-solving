package easy;


public class BalancedBT {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) return false;
        else return true;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
