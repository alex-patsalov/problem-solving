package easy;

import java.util.Collections;
import java.util.List;

public class MaximumToys {

    // https://www.hackerrank.com/challenges/mark-and-toys/problem

    public static int maximumToys2(List<Integer> prices, int k) {
        int count = 0;
        Collections.sort(prices);
        System.out.println(prices);
        for (Integer price : prices) {
            if (k > price) {
                k -= price;
                count++;
            }
        }
        return count;
    }

}
