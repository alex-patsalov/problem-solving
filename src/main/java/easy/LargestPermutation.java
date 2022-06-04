package easy;

import java.util.*;

public class LargestPermutation {

    // https://www.hackerrank.com/challenges/largest-permutation/problem

    public static List<Integer> largestPermutation(int k, List<Integer> arr) { // 2 1 5 4 3
        int max = arr.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), i);
        }
        for (int i = 0; k > 0 && i < arr.size(); i++, max--) {
            int val = arr.get(i);
            if (val == max) continue;

            int maxIndex = map.get(max);
            arr.set(i, max);
            arr.set(maxIndex, val);
            map.put(val, maxIndex);
            k--;
        }
        return arr;
    }


}
