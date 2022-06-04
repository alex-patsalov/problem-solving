package easy;

import java.util.List;

public class SherlockAndArray {

  // https://www.hackerrank.com/challenges/sherlock-and-array/problem

  public static String balancedSums(List<Integer> arr) {
    int total = arr.stream().reduce(Integer::sum).get();
    int leftSum = 0;
    for (Integer integer : arr) {
      if (leftSum == total - leftSum - integer) return "YES";
      else leftSum += integer;
    }
    return "NO";
  }
}
