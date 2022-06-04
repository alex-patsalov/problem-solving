package easy;

import java.util.List;

public class BeautifulPairs {

    // https://www.hackerrank.com/challenges/beautiful-pairs/problem

    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if(B.contains(A.get(i))) {
                count++;
                B.remove(A.get(i));
            }
        }
        return count == A.size() ? count - 1 : count + 1;
    }
    
}
