package medium;

import java.util.*;
import java.util.stream.Collectors;

public class OrganzingContainers {

    // https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem

    public static String organizingContainers(List<List<Integer>> container) {
        HashSet<Integer> containers = new HashSet<>();
        HashSet<Integer> colors = new HashSet<>();
        for (int i = 0; i < container.size(); i++) {
            int balls = 0, size = 0;
            for (int k = 0; k < container.get(i).size(); k++) {
                balls += container.get(k).get(i);
                size += container.get(i).get(k);
            }
            containers.add(size);
            colors.add(balls);
        }
        return containers.equals(colors) ? "Possible" : "Impossible";
    }

}
