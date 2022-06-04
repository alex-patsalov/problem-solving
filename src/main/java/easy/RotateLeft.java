package easy;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {

  public static List<Integer> rotateLeft2(int d, List<Integer> arr) {
    int steps = d % arr.size();
    while (steps != 0){
      arr.add(arr.remove(0));
      steps--;
    }
    return arr;
  }

  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    int size = arr.size();
    int steps = d % size;
    List<Integer> res = new ArrayList<>(arr);
    for (int i = 0; i < size; i++) {
      int index = (i + size - steps) % size;
      res.set(index, arr.get(i));
    }
    return res;
  }

}
