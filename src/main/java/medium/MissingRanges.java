package medium;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public static List<List<Integer>> solution(List<Integer> ints, int low, int high) {
        List<List<Integer>> res = new ArrayList<>();
        if (ints.size() == 0) return List.of(List.of(low, high));
        if (ints.get(0) > low) res.add(List.of(low, ints.get(0) - 1));
        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i) - ints.get(i - 1) > 1)
                res.add(List.of(ints.get(i - 1) + 1, ints.get(i) - 1));
        }
        if (ints.get(ints.size() - 1) < high) res.add(List.of(ints.get(ints.size() - 1) + 1, high));
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        solution(List.of(0, 1, 3, 50, 75), 0, 99);
    }

}
