package easy;

public class InvertBinTree {

    //    https://leetcode.com/problems/invert-binary-tree/description/
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

    public TreeNode invertTree(TreeNode curr) {
        if (curr == null) return curr;
        TreeNode left = curr.left;
        TreeNode right = curr.right;
        curr.left = right;
        curr.right = left;
        invertTree(curr.left);
        invertTree(curr.right);
        return curr;
    }


}
