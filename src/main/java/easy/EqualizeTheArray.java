package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {

  public static int equalizeArray(List<Integer> arr) {
    int[] array = new int[101];
    int max = 0;
    for (Integer i : arr){
      array[i]++;
      max = Math.max(max, array[i]);
    }
    return arr.size() - max;

  }

  public static int equalizeArray2(List<Integer> arr) {
    int max = 1;
    Map<Integer, Integer> nums = new HashMap<>();
    for (int i : arr)
      if (!nums.containsKey(i))
        nums.put(i, 1);
      else {
        nums.put(i, nums.get(i) + 1);
        if (max < nums.get(i))
          max = nums.get(i);
      }
    return arr.size() - max;
  }

}
