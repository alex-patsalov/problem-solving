package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/manasa-and-stones/problem
 * */

public class ManasaAndStones {

  public static List<Integer> stones(int stones, int diff1, int diff2) {
    List<Integer> array = new ArrayList<>();
    for (int i = 0; i < stones; i++) {
      int sum = i * diff1 + ((stones - i - 1) * diff2);
      if(!array.contains(sum)) array.add(sum);
    }

    return array.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
  }

}
