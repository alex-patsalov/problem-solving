package medium;

import java.util.Arrays;

public class LongestSubsequence {

    // https://leetcode.com/problems/longest-common-subsequence/

    public static int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        int[][] matrix = new int[length1 + 1][length2 + 1];
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                char char1 = text1.charAt(i - 1);
                char char2 = text2.charAt(j - 1);
                if (char1 == char2)
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                else
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
        }
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
        return matrix[length1][length2];
    }

    public static void main(String[] args) {
        longestCommonSubsequence("abcde", "ace");
    }
}
