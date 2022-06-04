package easy;

import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {

  public static int pickingNumbers(List<Integer> array) {
    List<Integer> longest = new ArrayList<>();
    List<Integer> secondLongest = new ArrayList<>();
    for (int i = 0; i < array.size(); i++) {
      for (int j = 0; j < array.size(); j++) {
        if (array.get(j) - array.get(i) == 0 || array.get(j) - array.get(i) == 1) longest.add(j);
      }
      if (longest.size() > secondLongest.size()) {
        secondLongest.clear();
        secondLongest.addAll(longest);
      }
      longest.clear();
    }

    return secondLongest.size();
  }

  public static int pickingNumbersOpt(List<Integer> array) {
    int res = 1;
    int[] ints = new int[101];
    for (Integer i : array) {
      ints[i]++;
    }
    for (int i = 1; i < array.size(); i++) {
      res = Math.max(res, ints[i] + ints[i + 1]);
    }
    return res;
  }

}
