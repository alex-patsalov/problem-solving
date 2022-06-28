package easy;

public class SearchInsert {
    // https://leetcode.com/problems/search-insert-position/
    public static int searchInsert2(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                index = i;
                break;
            } else if (target < nums[i]) {
                index = i;
                break;
            } else if (target > nums[i] && i == nums.length - 1) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
        return index;
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5};
        int targer = 6;
        int i = searchInsert(nums, targer);
        System.out.println(i);
    }
}
