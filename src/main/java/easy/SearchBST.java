package easy;

public class SearchBST {
    // https://leetcode.com/problems/search-in-a-binary-search-tree/
    public static class TreeNode {
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

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        TreeNode curr = root;
        if (val < curr.left.val) return searchBST(curr.left, val);
        else if (val > curr.right.val) return searchBST(curr.right, val);
        else if (val == curr.val) return curr;
        else return null;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        TreeNode treeNode = searchBST(root, 2);
        System.out.println(treeNode);
    }

}
