package sorting;

import java.util.List;
import java.util.stream.Collectors;

public class BigSorting {

  public static List<String> bigSorting(List<String> unsorted) {
    return unsorted.stream().sorted((s1, s2) -> {
      if (s1.length() != s2.length()) return s1.length() - s2.length();
      else return s1.compareTo(s2);
    }).collect(Collectors.toList());

  }

}
