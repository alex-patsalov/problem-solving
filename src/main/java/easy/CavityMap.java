package easy;

import java.util.List;

public class CavityMap {

  /*
   * https://www.hackerrank.com/challenges/cavity-map/problem
   * */

  public static List<String> cavityMap(List<String> grid) {

    for (int i = 1; i < grid.size() - 1; i++) {
      for (int j = 1; j < grid.get(i).length() - 1; j++) {
        int left = Character.getNumericValue(grid.get(i).charAt(j - 1));
        int right = Character.getNumericValue(grid.get(i).charAt(j + 1));
        int up = Character.getNumericValue(grid.get(i - 1).charAt(j));
        int down = Character.getNumericValue(grid.get(i + 1).charAt(j));
        int middle = Character.getNumericValue(grid.get(i).charAt(j));

        if (left < middle && up < middle && right < middle && down < middle) {
          StringBuilder sb = new StringBuilder(grid.get(i));
          sb.setCharAt(j, 'X');
          grid.set(i, sb.toString());
        }
      }
    }
    return grid;
  }

}
