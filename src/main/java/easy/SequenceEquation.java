package easy;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {


  public static List<Integer> permutationEquation2(List<Integer> p) {
    List<Integer> res = new ArrayList<>();
    for (int i = 1; i <= p.size(); i++) {
      int index = p.indexOf(i);
      index++;
      int index2 = p.indexOf(index);
      index2++;
      res.add(index2);
    }
    return res;
  }

  public static List<Integer> permutationEquation(List<Integer> p) {
    List<Integer> res = new ArrayList<>();
    for (int i = 1; i <= p.size(); i++) {
      res.add(p.indexOf(p.indexOf(i) + 1) + 1);
    }
    return res;
  }

}
