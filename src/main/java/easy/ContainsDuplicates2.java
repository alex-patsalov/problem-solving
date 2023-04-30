package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates2 {
    // https://leetcode.com/problems/contains-duplicate-ii/

    public static boolean containsNearbyDuplicateSlow(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == nums[i] && j != i && Math.abs(j - i) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) != i && Math.abs(map.get(nums[i]) - i) <= k)
                return true;
            else map.put(nums[i], i);
        }
        return false;
    }

    public static boolean containsNearbyDuplicateSlideWindow(int[] nums, int k) {
        if (k == 0) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            if (i >= k) {
                set.remove(nums[i - k]);
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = containsNearbyDuplicateSlideWindow(new int[]{1, 2, 3, 1}, 2);
    }
}
