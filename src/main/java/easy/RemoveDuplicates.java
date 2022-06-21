package easy;

public class RemoveDuplicates {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        int prevElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prevElement) {
                nums[pointer] = nums[i];
                prevElement = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

}
