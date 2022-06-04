package easy;

import java.util.List;

public class HurdleRace {

  public static int hurdleRace(int height, List<Integer> obstacles) {
    Integer maxHeight = obstacles.stream().max(Integer::compareTo).get();
    return Math.max(maxHeight - height, 0);
  }

}
