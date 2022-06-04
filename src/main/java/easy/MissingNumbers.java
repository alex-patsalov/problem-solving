package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumbers {

  // https://www.hackerrank.com/challenges/missing-numbers/problem

  public static List<Integer> missingNumbers2(List<Integer> first, List<Integer> second) {
    List<Integer> missing = new ArrayList<>();
    for (Integer i : second){
      if(!first.contains(i)) missing.add(i);
      else first.remove(i);
    }
    return missing.stream().distinct().sorted().collect(Collectors.toList());
  }

  public static List<Integer> missingNumbers(List<Integer> first, List<Integer> second) {
    first.forEach(o -> second.remove(o));
    return second.stream().distinct().sorted().collect(Collectors.toList());
  }

}
