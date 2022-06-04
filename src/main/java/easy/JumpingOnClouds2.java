package easy;

import java.util.List;

public class JumpingOnClouds2 {

  public static int jumpingOnClouds2(List<Integer> c) {
    int count = 0;
    int step = 0;
    while (step < c.size()) {
      if (step + 2 < c.size() && c.get(step + 2) == 0) step = step + 2;
      else step++;
      count++;
    }
    return count - 1;
  }

  public static int jumpingOnClouds(List<Integer> c) {
    int count = 0;
    for (int i = 0; i < c.size(); i++, count++) {
      if (i < c.size() - 2 && c.get(i + 2) == 0) i++;
    }
    return count - 1;
  }

}
