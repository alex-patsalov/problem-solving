package easy;

public class FunnyString {

  /*
   * https://www.hackerrank.com/challenges/funny-string/problem
   * */

  public static String funnyString(String str) {
    for (int i = 0, j = str.length() - 1; i < str.length() - 1 && j > 1; i++, j--) {
      int strDiff = Math.abs(str.charAt(i) - str.charAt(i + 1));
      int revDiff = Math.abs(str.charAt(j) - str.charAt(j - 1));
      if (strDiff != revDiff) return "Not Funny";
    }
    return "Funny";
  }

}
