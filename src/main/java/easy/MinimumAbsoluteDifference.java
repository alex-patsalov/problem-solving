package easy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsoluteDifference {

  //  https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem

  public static int minimumAbsoluteDifference(List<Integer> arr) {
    List<Integer> sorted = arr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    int min = Math.abs(sorted.get(1) - sorted.get(0));
    for (int i = 0; i < sorted.size() - 1; i++) {
      min = Math.min(min, Math.abs(sorted.get(i + 1) - sorted.get(i)));
    }
    return min;
  }
}
