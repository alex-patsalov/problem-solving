package easy;

import java.util.Locale;

public class CaesarCypher {
//  https://www.hackerrank.com/challenges/caesar-cipher-1/problem

  static final String lettersU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  static final String lettersL = "abcdefghijklmnopqrstuvwxyz";

  public static String caesarCipher(String s, int k) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      int il = lettersL.indexOf(c);
      int iu = lettersU.indexOf(c);
      int newIdx;
      if (il > -1) {
        newIdx = (il + k) % lettersL.length();
        c = lettersL.charAt(newIdx);
      }
      if (iu > -1) {
        newIdx = (iu + k) % lettersU.length();
        c = lettersU.charAt(newIdx);
      }
      sb.append(c);
    }
    return sb.toString();
  }
}
