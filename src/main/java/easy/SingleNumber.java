package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleNumber {
//    https://leetcode.com/problems/single-number/
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums){
            freq.compute(num, (k,v) -> v == null ? 1 : v + 1);
        }
        return freq.entrySet()
                .stream()
                .filter((e) -> e.getValue() == 1L)
                .findAny().get().getKey();
    }

    public static int singleNumber_f(int[] nums) {
//        HashMap<Integer, Long> map = Arrays.stream(nums).boxed()
//                .collect(Collectors.groupingBy(k -> k, () -> new HashMap<>(), Collectors.counting()));
//        Optional<Map.Entry<Integer, Long>> res = map.entrySet().stream().filter((e) -> e.getValue() == 1L).findAny();
        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(k -> k, () -> new HashMap<>(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter((e) -> e.getValue() == 1L)
                .findAny().get().getKey();
    }

    public static int singleNumber_it2(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i+=2) {
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        singleNumber_f(new int[]{4, 1, 2, 1, 2});
    }
}
