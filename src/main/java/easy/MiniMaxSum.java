package easy;

import java.util.List;

public class MiniMaxSum {
  public static void miniMaxSum(List<Integer> arr) {

    Integer min = arr.get(0);
    Integer max = arr.get(0);
    Integer sum = 0;
    for (Integer integer : arr) {
      if (integer < min) min = integer;
      if (integer > max) max = integer;
      sum += integer;
    }
    System.out.printf("%d %d\n", sum - max, sum - min);

  }

  public static void miniMaxSum2(List<Integer> arr) {

    long min = arr.stream().mapToLong(i -> i).min().getAsLong();
    long max = arr.stream().mapToLong(i -> i).max().getAsLong();
    long sum = arr.stream().mapToLong(i -> i).sum();
    System.out.printf("%d %d\n", sum - max, sum - min);
  }



}
