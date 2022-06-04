package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumDistances {

  public static int minimumDistances2(List<Integer> arr) {
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < arr.size(); i++) {
      for (int j = arr.size() - 1; j >= i + 1; j--) {
        int target = arr.get(i);
        if (target == arr.get(j)) {
          int d = j - i;
          res.add(d);
        }
      }
    }

    return res.size() != 0 ? res.stream().sorted().collect(Collectors.toList()).get(0) : -1;
  }

  public static int minimumDistances(List<Integer> a) {
    int min = 0;
    List<Integer> distances = new ArrayList<>();
    for (int i = 0; i < a.size(); i++) {
      int target = a.get(i);
      for (int j = a.size() - 1; j > i; j--)
        if (target == a.get(j)) {
          distances.add(j - i);
          min = Collections.min(distances);
        }
    }
    if (min == 0)
      return -1;
    return min;
  }

}
