package easy;

public class DigitPalindromApp {
  //  https://www.hackerrank.com/challenges/richie-rich/problem
  public static String isPalindromWeird(String number, int swaps) {
    char[] chars = number.toCharArray();
    int minChanges = 0;
    for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
      if (chars[i] != chars[j]) {
        minChanges++;
      }
    }
    System.out.printf("required changes: %d\n", minChanges);

    if (minChanges > swaps) return "-1";
    int canChangeBoth = swaps - minChanges;
    int left = 0;
    int right = chars.length - 1;

    for (; left <= right; left++, right--) {

      if (chars[left] != chars[right]) {

        char maxChar = (char) Math.max(chars[left], chars[right]);
        if (maxChar != '9' && canChangeBoth - 1 >= 0) { //weird
          chars[left] = '9';
          chars[right] = '9';
          canChangeBoth--; //weird
        } else {
          chars[left] = maxChar;
          chars[right] = maxChar;
          minChanges--;
        }
      } else if (chars[left] == chars[right]) {
        char maxChar = (char) Math.max(chars[left], chars[right]);
        if (maxChar != '9' && canChangeBoth - 2 >= 0) { //weird
          chars[left] = '9';
          chars[right] = '9';
          canChangeBoth -= 2; // weird
        }
      }
    }
    if (canChangeBoth != 0 && left - 1 == right + 1) {
      chars[left - 1] = '9';
    }
    return new String(chars);
  }

  public static String isPalindrom(String number, int swaps) {
    char[] chars = number.toCharArray();
    int minChanges = 0;
    for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
      if (chars[i] != chars[j]) {
        minChanges++;
      }
    }
    System.out.printf("required changes: %d\n", minChanges);

    if (minChanges > swaps) return "impossible";
    int left = 0;
    int right = chars.length - 1;

    for (; left <= right; left++, right--) {

      if (chars[left] != chars[right]) {

        char maxChar = (char) Math.max(chars[left], chars[right]);
        if (maxChar != '9' && swaps - minChanges > 0) {
          chars[left] = '9';
          chars[right] = '9';
          swaps -= 2;
        } else {
          chars[left] = maxChar;
          chars[right] = maxChar;
          swaps--;
        }
      } else if (chars[left] == chars[right]) {
        char maxChar = (char) Math.max(chars[left], chars[right]);
        if (maxChar != '9' && swaps - minChanges > 0) {
          chars[left] = '9';
          chars[right] = '9';
          swaps -= 2;
        }
      }
    }
    if (swaps != 0 && chars[left - 1] == chars[right + 1]) {
      chars[left - 1] = '9';
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    String s = isPalindrom("092282", 3);
    System.out.println(s);
  }

}
