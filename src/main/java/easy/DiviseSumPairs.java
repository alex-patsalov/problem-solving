package easy;

import java.util.List;

public class DiviseSumPairs {

  public static int divisibleSumPairs(int length, int denominator, List<Integer> arr) {
    int counter = 0;
    for (int i = 0; i < length - 1; i++) {
      for (int j = i + 1; j < length; j++) {
        if((arr.get(i) + arr.get(j)) % denominator == 0) counter++;
      }
    }
    return counter;
  }

}
