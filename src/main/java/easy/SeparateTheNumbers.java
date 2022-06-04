package easy;

public class SeparateTheNumbers {

  /*
  https://www.hackerrank.com/challenges/separate-the-numbers/problem?h_r=next-challenge&h_v=zen
   */

  public static void separateNumbers(String original) { //1 2 3 4 5
    boolean valid = false;
    long first = -1;
    for (int i = 1; i <= original.length() / 2; ++i) {
      long number = Long.parseLong(original.substring(0, i));
      first = number;
      String testString = Long.toString(number);
      while (testString.length() < original.length()) {
        testString += Long.toString(++number);
      }
      if (testString.equals(original)) {
        valid = true;
        break;
      }
    }
    System.out.println(valid ? "YES " + first : "NO");
  }

}
