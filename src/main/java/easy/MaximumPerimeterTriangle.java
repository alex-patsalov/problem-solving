package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumPerimeterTriangle {

//    https://www.hackerrank.com/challenges/maximum-perimeter-triangle/problem

    public static List<Long> maximumPerimeterTriangle(List<Long> sticks) {
        List<Long> res = new ArrayList<>();
        long maxPerimeter = -1;
        long currPerimeter = 0;
        sticks.sort(Comparator.reverseOrder());
        for (int i = 0; i < sticks.size() - 2; i++) {
            if (isValid(sticks.get(i), sticks.get(i + 1), sticks.get(i + 2))) {
                currPerimeter = sticks.get(i) + sticks.get(i + 1) + sticks.get(i + 2);
                if (currPerimeter > maxPerimeter) {
                    maxPerimeter = currPerimeter;
                    res.clear();
                    res.add(sticks.get(i));
                    res.add(sticks.get(i + 1));
                    res.add(sticks.get(i + 2));
                }

            }
        }
        if (res.isEmpty()) res.add(-1L);
        res.sort(Comparator.naturalOrder());
        return res;
    }

    private static boolean isValid(Long a, Long b, Long c) {
        return a < b + c;
    }

}
