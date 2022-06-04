package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  /**
   * https://leetcode.com/problems/two-sum/
   */

  public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length ; i++) {
      int remainder = target - nums[i];
      if(map.containsKey(remainder)){
        res[0] = i;
        res[1] = map.get(remainder);
      }
      map.put(nums[i], i);
    }
    return res;
  }

  public int[] twoSum3(int[] nums, int target) {
    int[] res = new int[2];
    for (int i = 0, j = 0; i < nums.length && j < nums.length; i++) {
      int remainder = target - nums[j];
      if(nums[i] == remainder && i != j){
        res[0] = i;
        res[1] = j;
      }
      if(i + 1 == nums.length){
        i = 0;
        j++;
      }
    }
    return res;
  }

  public int[] twoSum2(int[] nums, int target) {
    int[] res = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int remainder = target - nums[i];
      for (int j = 0; j < nums.length; j++) {
        if (j != i && nums[j] == remainder) {
          res[0] = i;
          res[1] = j;
        }
      }
    }
    return res;
  }

}
