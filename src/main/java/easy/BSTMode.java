package easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BSTMode {
//    https://leetcode.com/problems/find-mode-in-binary-search-tree
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

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> freqs = findMode_r(new HashMap<Integer, Integer>(), root);
        int max = freqs.values().stream().max(Comparator.naturalOrder()).get();
        return freqs.entrySet()
                .stream()
                .filter(p -> p.getValue() == max)
                .map(p -> p.getKey())
                .mapToInt(i -> i)
                .toArray();
    }

    private Map<Integer, Integer> findMode_r(HashMap<Integer, Integer> map, TreeNode root) {
        if (root == null) return map;
        int currVal = root.val;
        map.merge(currVal, 1, Integer::sum);
        findMode_r(map, root.left);
        findMode_r(map, root.right);
        return map;
    }


}
