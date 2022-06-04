package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IceCreamParlor {

    public static List<Integer> icecreamParlor2(int money, List<Integer> prices) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < prices.size() - 1; i++) {
            for (int j = i + 1; j < prices.size(); j++) {
                int sum = prices.get(i) + prices.get(j);
                if (sum == money) {
                    res.add(i);
                    res.add(j);
                }
            }
        }

        return res.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    public static List<Integer> icecreamParlor(int money, List<Integer> prices) {
        List<Integer> res = new ArrayList<>();
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < prices.size(); i++) {
            int firstPrice = prices.get(i);
            int secondPrice = money - firstPrice;
            idx1 = i;
            idx2 = prices.indexOf(money - firstPrice);
            if (prices.contains(secondPrice) && idx2 != idx1) break;
        }
        res.add(Math.min(idx1 + 1, idx2 + 1));
        res.add(Math.max(idx1 + 1, idx2 + 1));
        return res;
    }

}
