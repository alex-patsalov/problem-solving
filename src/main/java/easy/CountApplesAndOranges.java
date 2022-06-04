package easy;

import java.util.List;

public class CountApplesAndOranges {

  public static void countApplesAndOranges(int houseStart, int houseEnd, int appleTree, int orangeTree,
                                           List<Integer> applesDistances, List<Integer> orangeDistances) {

    Long applesHit = applesDistances
            .stream()
            .map(a -> a + appleTree)
            .filter(a -> a >= houseStart && a <= houseEnd).count();
    Long orangesHit = orangeDistances
            .stream()
            .map(o -> o + orangeTree)
            .filter(o -> o >= houseStart && o <= houseEnd).count();
    System.out.println(applesHit);
    System.out.println(orangesHit);
  }

}
