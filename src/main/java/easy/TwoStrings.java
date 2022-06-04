package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    // https://www.hackerrank.com/challenges/two-strings/problem

    public static String twoStrings(String s1, String s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("")));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("")));
        set1.retainAll(set2);
        return set1.isEmpty() ? "NO" : "YES";
    }

}
