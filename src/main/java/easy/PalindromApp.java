package easy;

public class PalindromApp {

  public static final String YES = "YES";
  public static final String NO = "NO";

  public static String isPalindrom(String s) { // aabbaa
    if (s.length() == 1) return YES;
    else {
      if(s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
        if (s.length() == 2) return YES;
        String shorterString = s.substring(1, s.length() - 1); // abba
        return isPalindrom(shorterString);
      }
    }
    return NO;
  }

  public static void main(String[] args) {
    String s = isPalindrom("abba");
    System.out.println(s);
  }

}
