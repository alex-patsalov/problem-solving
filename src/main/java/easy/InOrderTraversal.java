package easy;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
// https://leetcode.com/problems/binary-tree-inorder-traversal/
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

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        traverse(root, res);
        return res;
    }

    private void traverse(TreeNode node, List<Integer> res) {
        if (node.left != null) {
            traverse(node.left, res);
        }
        res.add(node.val);
        if (node.right != null) {
            traverse(node.right, res);
        }
    }

}
