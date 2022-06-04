package easy;

public class ReverseNumberApp {
  /*
   * 1) 123,  0 return (123/10, 0 * 10 + 123 % 10)
   * 2) 12,   3 return (12/10, 3 * 10 + 12 % 10
   * 3) 1,   32 return (1/10, 32 * 10 + 2 % 10)
   * 4) 0,  321 return 321
   * */
  public static int reverse(int number, int reversed) {
    System.out.print(number + " ");
    if (number == 0) return reversed;
    else return reverse(number / 10, reversed * 10 + number % 10);
  }

  public static int reverse(int num) {
    int reversed = 0;

    while (num > 0) {
      reversed = reversed * 10;
      reversed = reversed + num % 10;
      num = num / 10;
    }
    return reversed;
  }

  public static void main(String[] args) {
    System.out.println(reverse(12340, 0));
    System.out.println(reverse(12340));
  }

}
