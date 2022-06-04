package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClosestNumbers {

    // https://www.hackerrank.com/challenges/closest-numbers/problem?isFullScreen=false

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        arr.sort(Comparator.naturalOrder());
        for (int i = 0; i < arr.size() - 1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i + 1)) == minDiff) {
                res.add(arr.get(i));
                res.add(arr.get(i + 1));
            } else if (Math.abs(arr.get(i) - arr.get(i + 1)) < minDiff){
                minDiff = Math.abs(arr.get(i) - arr.get(i + 1));
                res.clear();
                res.add(arr.get(i));
                res.add(arr.get(i + 1));
            }
        }
        return res;
    }
}
