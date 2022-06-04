package easy;

import java.util.List;

public class MigratoryBirds {

  public static int migratoryBirds(List<Integer> arr) {
    int[] depth = new int[arr.size()];
    for (Integer integer : arr) {
      depth[integer]++;
    }
    int maxD = 0;
    int maxV = 0;
    for (int i = 0; i < depth.length; i++) {
      if (depth[i] > maxD) {
        maxD = depth[i];
        maxV = i;
      }
    }
    return maxV;
  }

}
