package easy;

import java.util.List;

public class LonelyInteger {

    // https://www.hackerrank.com/challenges/lonely-integer/problem

    public static int lonelyinteger2(List<Integer> a) {
        int lonely = 0;
        int[] freq = new int[99];
        for (Integer i : a) freq[i]++;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == 1) lonely = i;
        }
        return lonely;
    }

    public static int lonelyinteger3(List<Integer> a) {
        int lonely = 0;
        for (Integer integer : a) lonely = lonely ^ integer;
        return lonely;
    }

    public static int lonelyinteger(List<Integer> a) {
        return a.stream().reduce(0, (x,y) -> x ^ y);
    }



}
