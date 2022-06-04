package easy;

public class PalindromNumber {

  /*
   * https://leetcode.com/problems/palindrome-number/
   * */

  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    String rev = new StringBuilder(String.valueOf(x)).reverse().toString();
    return rev.equals(String.valueOf(x));
  }

  public boolean isPalindrome2(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) return false;
    int reversed = 0;
    while (x > reversed) {
      reversed = reversed * 10 + x % 10;
      x /= 10;
    }
    return x == reversed || x == reversed / 10;
  }

  public boolean isPalindrome3(int x) {
    String str = String.valueOf(x);
    int start = 0;
    int end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start++) != str.charAt(end--)) return false;
    }
    return true;
  }
}
