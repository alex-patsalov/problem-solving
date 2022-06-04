package easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class HackerRankInString {
//  https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

  static final String YES = "YES";
  static final String NO = "NO";
  static final String hackWord = "hackerrank";

  public static String hackerrankInString(String word) {
    Queue<Character> hackerrank = new ArrayDeque<>();
    for (char c : hackWord.toCharArray()) hackerrank.add(c);
    for (int i = 0; i < word.length(); i++) {
      if (hackerrank.isEmpty()) return "YES";
      if (hackerrank.peek() == word.charAt(i)) hackerrank.remove();
    }
    return hackerrank.isEmpty() ? "YES" : "NO";
  }

  public static String hackerrankInString2(String word) {
    int ih = 0;
    int wi = 0;
    for (; wi < word.length() && ih < hackWord.length(); wi++) {
      char hc = hackWord.charAt(ih);
      char wordC = word.charAt(wi);
      if (hc == wordC) ih++;
    }
    return ih == hackWord.length() ? "YES" : "NO";
  }

}
