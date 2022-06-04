package easy;

import java.util.*;
import java.util.stream.Collectors;

public class JimAndOrders {

    // https://www.hackerrank.com/challenges/jim-and-the-orders/problem

    public static List<Integer> jimOrders2(List<List<Integer>> orders) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < orders.size(); i++) {
            int sum = orders.get(i).get(0) + orders.get(i).get(1);
            res.put(i + 1,sum);
        }
        return res
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        return orders
                .stream()
                .collect(Collectors.toMap(o -> orders.indexOf(o) + 1, oo -> oo.get(0) + oo.get(1)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(){{add(1); add(1);}});
        list.add(new ArrayList<>(){{add(1); add(1);}});
        jimOrders(list);
    }

}
