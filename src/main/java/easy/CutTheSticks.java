package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

  public static List<Integer> cutTheSticks(List<Integer> arr) {
    int min;
    List<Integer> res = new ArrayList<>();
    while (arr.size() != 0){
      res.add(arr.size());
      min = arr.stream().min(Integer::compareTo).get();
      int delta = min;
      arr = arr.stream().map(i -> (i - delta)).filter(i -> i > 0).collect(Collectors.toList());
    }
    return res;
  }

}
