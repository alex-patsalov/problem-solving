package easy;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {

  public static List<Integer> breakingRecords(List<Integer> scores) {
    List<Integer> count = new ArrayList<>();
    int min = scores.get(0);
    int max = scores.get(0);
    int maxC = 0;
    int minC = 0;
    for (Integer score : scores) {
      if (score > max) {
        max = score;
        maxC++;
      }
      if(score < min){
        min = score;
        minC++;
      }
    }
    count.add(maxC);
    count.add(minC);
    return count;
  }

}
