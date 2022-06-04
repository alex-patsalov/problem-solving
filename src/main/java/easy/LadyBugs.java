package easy;

import java.util.HashMap;
import java.util.Map;

public class LadyBugs {
  /**
   * https://www.hackerrank.com/challenges/happy-ladybugs/problem
   */
  public static String happyLadybugs(String str) {
    char[] chars = str.toCharArray();
    Map<Character, Integer> depth = new HashMap<>();
    for (char c : chars) {
      if (c == '_') continue;
      if (!depth.containsKey(c)) depth.put(c, 1);
      else depth.put(c, depth.get(c) + 1);
    }
    boolean match = depth.values().stream().anyMatch(v -> v < 2);
    if (match) return "NO";
    if (!str.contains("_")){
      for (int i = 1; i < chars.length - 1; i++) { // RRBCBAA
        if (chars[i] != chars[i - 1] && chars[i] != chars[i + 1]) return "NO";
      }
    }
    return "YES";
  }

}
