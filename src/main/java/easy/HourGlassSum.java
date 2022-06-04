package easy;

import java.util.List;

public class HourGlassSum {

  public static int hourglassSum(List<List<Integer>> arr) {
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        sum += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
        sum += arr.get(i + 1).get(j + 1);
        sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
        maxSum = Math.max(sum, maxSum);
        sum = 0;
      }
    }
    return maxSum;
  }


}
