package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                result.add(List.of(1));
            } else if (i == 1) {
                result.add(List.of(1, 1));
            } else {
                result.add(new ArrayList<>());
                List<Integer> current = result.get(i);
                for (int j = 1; j < i; j++) {
                    current.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                }
                current.add(0, 1);
                current.add(i, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (List<Integer> integers : generate(6)) {
            System.out.println(integers);
        }

    }

}
