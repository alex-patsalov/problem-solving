package easy;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {

  // https://www.hackerrank.com/challenges/grid-challenge/problem

  public static String gridChallenge(List<String> grid) {
    for (int i = 0 ; i < grid.size(); i++) {
      char[] c = grid.get(i).toCharArray();
      Arrays.sort(c);
      grid.set(i, new String(c));
    }

    for (int i = 0 ; i < grid.size() - 1; i++) {
      for (int j = 0; j < grid.get(0).length(); j++) {
        if (grid.get(i).charAt(j) > grid.get(i + 1).charAt(j)) return "NO";
      }
    }
    return "YES";
  }
}
