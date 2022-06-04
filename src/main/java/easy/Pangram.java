package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Pangram {

//  https://www.hackerrank.com/challenges/pangrams/problem

  public static String pangrams(String s) {
    int[] chars = new int[26];
    for (char c : s.toLowerCase().toCharArray()) {
      if (c < 97) continue;
      int idx = c - 97;
      chars[idx]++;
    }
    return (int) Arrays.stream(chars).filter(i -> i == 0).count() == 0 ? "pangram" : "not pangram";
  }

  public static String pangrams2(String s) {
    Set<Character> set = new HashSet<>();
    for (Character c : s.toLowerCase(Locale.ROOT).toCharArray()) set.add(c);
    return set.size() == 27 ? "pangram" : "not pangram";
  }

}
