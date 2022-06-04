package easy;

import java.util.Arrays;

public class MaximizingXOR {

    // https://www.hackerrank.com/challenges/maximizing-xor/problem

    public static int maximizingXor(int l, int r) {
        int max = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                max = Math.max(max, i ^ j);
            }
        }
        return max;
    }

}
