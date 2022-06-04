package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceLane {

  public static List<Integer> serviceLane(List<Integer> widths, List<List<Integer>> cases) {
    List<Integer> maxWidthArray = new ArrayList<>();
    int maxWidth = Integer.MAX_VALUE;
    for (List<Integer> list : cases) {
      int start = list.get(0);
      int end = list.get(1);
      for (int i = start; i < end; i++) {
        if (widths.get(i) < maxWidth) maxWidth = widths.get(i);
      }
      maxWidthArray.add(maxWidth);
    }

    return maxWidthArray;
  }

  public static List<Integer> serviceLane2(List<Integer> widths, List<List<Integer>> cases) {
    List<Integer> result = new ArrayList<>();
    for (List<Integer> c : cases) {
      Integer i = c.get(0);
      Integer j = c.get(1);
      result.add(Collections.min(widths.subList(i, j + 1)));
    }
    return result;

  }

}
