package easy;

import java.util.Arrays;

public class MergerSortedArrays {

    // https://leetcode.com/problems/merge-sorted-array/

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1;
        while (m - 1 >= 0 && n - 1 >= 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[idx--] = nums1[m - 1];
                m--;
            } else {
                nums1[idx--] = nums2[n - 1];
                n--;
            }
        }

        while (m - 1 >= 0) {
            nums1[idx--] = nums1[m - 1];
            m--;
        }
        while (n - 1 >= 0) {
            nums1[idx--] = nums2[n - 1];
            n--;
        }
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,2,4}, 3);
    }

}
