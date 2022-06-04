package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PryankaAndToys {

    // https://www.hackerrank.com/challenges/priyanka-and-toys/problem


    public static int toys(List<Integer> w) {
        int count = 1;
        Collections.sort(w);
        int weight = w.get(0) + 4;
        for (int i = 1; i < w.size(); i++) {
            if(w.get(i) > weight){
                count++;
                weight = w.get(i) + 4;
            }
        }
        return count;
    }

    public static int toys2(List<Integer> w) {
        int count = 0;
        Collections.sort(w);
        List<Integer> collect = new ArrayList<>(w);
        while (collect.size() > 0){
            int range = collect.get(0) + 4;
            collect = collect.stream().filter(i -> i > range).collect(Collectors.toList());
            count++;
        }
        return count;
    }

}
