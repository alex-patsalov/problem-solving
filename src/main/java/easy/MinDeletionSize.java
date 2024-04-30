package easy;

import java.util.Arrays;

public class MinDeletionSize {

    // https://leetcode.com/problems/delete-columns-to-make-sorted/
    //abc
    //bce
    //cae
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        new MinDeletionSize().minDeletionSize(new String[]{"cba", "daf", "ghi"});
        new MinDeletionSize().minDeletionSize(new String[]{"a","b"});
        new MinDeletionSize().minDeletionSize(new String[]{"zyx","wvu","tsr"});
    }

}
