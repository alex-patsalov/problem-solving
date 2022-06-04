package easy;

public class FindDigits {

  public static int findDigits2(int number) {
    char[] ints = String.valueOf(number).toCharArray();
    int counter = 0;
    for (Character i : ints) {
      int div = Integer.parseInt(String.valueOf(i));
      if (div == 0) continue;
      if (number % div == 0) counter++;
    }
    return counter;
  }


  public static int findDigits(int number) {
    int digits = number;
    int lastDigit;
    int count = 0;

    while (digits > 0) {
      lastDigit = digits % 10;
      digits = digits / 10;
      if (lastDigit != 0 && number % lastDigit == 0) {
        count++;
      }
    }
    return count;
  }

}
