package easy;

import java.util.Collections;
import java.util.List;

public class PermuteArrays {

    // https://www.hackerrank.com/challenges/two-arrays/problem

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i) + B.get(i) < k) return "NO";
        }
        return "YES";

    }

}
