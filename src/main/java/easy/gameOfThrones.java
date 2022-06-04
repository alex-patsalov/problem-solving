package easy;

import java.util.Arrays;

public class gameOfThrones {

    // https://www.hackerrank.com/challenges/game-of-thrones/problem

    public static String gameOfThrones(String s) {
        if (s.length() < 2) return "YES";
        int[] freq = new int[26];
        s.chars().forEach(c -> freq[c - 'a']++);
        if (s.length() % 2 == 0) return Arrays.stream(freq).filter(f -> f % 2 != 0).count() > 0 ? "NO" : "YES";
        else return Arrays.stream(freq).filter(f -> f % 2 != 0).count() > 1 ? "NO" : "YES";
    }
}
