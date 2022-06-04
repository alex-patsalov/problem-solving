package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {

  // https://www.hackerrank.com/challenges/luck-balance/problem

  public static int luckBalance2(int k, List<List<Integer>> contests) {
    List<List<Integer>> sorted = contests
            .stream()
            .sorted((c1, c2) -> {
              if (c1.get(1) == c2.get(1)) {
                return Integer.compare(c2.get(0), c1.get(0));
              }
              return Integer.compare(c2.get(1), c1.get(1));
            })
            .collect(Collectors.toList());
    System.out.println(sorted);
    int luck = 0;
    for (List<Integer> l: sorted){
      if (l.get(1) == 1) {
        if (k > 0) {
          luck += l.get(0);
          k--;
        } else luck -= l.get(0);
      } else luck += l.get(0);
    }

    return luck;
  }

  public static int luckBalance(int k, List<List<Integer>> contests) {
    List<List<Integer>> sorted = contests
            .stream()
            .sorted((c1, c2) -> {
              if (c1.get(1) == c2.get(1)) {
                return Integer.compare(c1.get(0), c2.get(0));
              }
              return Integer.compare(c2.get(1), c1.get(1));
            })
            .collect(Collectors.toList());
    List<List<Integer>> important = sorted.stream().filter(c -> c.get(1) == 1).collect(Collectors.toList());
    int toSkip = Math.max(important.size() - k, 0);
    int luckCollected = sorted.stream().skip(toSkip).mapToInt(c -> c.get(0)).sum();
    int luckToBeLost = sorted.stream().limit(toSkip).mapToInt(c -> c.get(0)).sum();

    return luckCollected - luckToBeLost;
  }
}
