package easy;

import java.util.Arrays;

public class RemoveElement {

    // https://leetcode.com/problems/remove-element/

    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) nums[index++] = nums[i];
        }
        return index;
    }

    public static int removeElement(int[] nums, int val) {
        return (int)Arrays.stream(nums).filter(n -> n != val).count();
    }
    

}
