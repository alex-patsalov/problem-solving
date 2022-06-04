package easy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMedian {

    // https://www.hackerrank.com/challenges/find-the-median/problem

    public static int findMedian(List<Integer> arr) {
        return arr.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList())
                .get(arr.size() / 2);
    }

}
