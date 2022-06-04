package easy;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

  public static List<Integer> circularArrayRotation(List<Integer> array, int rotations, List<Integer> queries) {
    List<Integer> res = new ArrayList<>(array);

    for (int i = 0; i < array.size(); i++) {
      res.set((i + rotations) % array.size(), array.get(i));
    }
    for (int i = 0; i < queries.size(); i++) {
      queries.set(i, res.get(queries.get(i)));
    }
    return queries;
  }

  public static List<Integer> circularArrayRotationSlow(List<Integer> array, int rotations, List<Integer> queries) {
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < rotations; i++) {
      int last = array.get(array.size() - 1);

      for (int j = array.size() - 1; j > 0; j--) {
        array.set(j, array.get(j - 1));
      }
      array.set(0, last);
    }

    for (int i = 0; i < queries.size(); i++) {
      res.add(i, array.get(queries.get(i)));
    }

    return res;
  }

}
