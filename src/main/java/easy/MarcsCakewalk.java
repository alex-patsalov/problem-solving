package easy;

import java.util.Comparator;
import java.util.List;

public class MarcsCakewalk {

//  https://www.hackerrank.com/challenges/marcs-cakewalk/problem

  public static long marcsCakewalk(List<Integer> calorie) {
    calorie.sort(Comparator.reverseOrder());
    long total = 0;
    for (int i = 0; i < calorie.size(); i++) {
      total+= Math.pow(2, i) * calorie.get(i);
    }
    return total;

  }

}
