package easy;

import java.util.List;

public class SubArrayDivision {

  public static int birthday(List<Integer> array, int sum, int qnty) {
    int counter = 0;
    int res;
    int cycles;
    for (int i = 0; i <= array.size() - qnty; i++) {
      cycles = qnty;
      res = 0;
      for (int j = i; cycles > 0; j++, cycles--) {
        res += array.get(j);
      }
      if (res == sum) counter++;
    }
    return counter;
  }

}
