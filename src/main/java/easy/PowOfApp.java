package easy;

public class PowOfApp {

  public static int powOfHR(int x, int y) {
    return y == 1 ? x : x * powOfHR(x, y - 1);
  }

  public static int powOfTR(int x, int y, int sum) {
    if (y == sum) return x;
    return x * powOfTR(x, y - 1, sum);
  }

  public static int powOfTR0(int x, int y) {
    return powOfTR(x, y, 1);
  }

  public static void main(String[] args) {

    int i = powOfTR0(2, 3);
    System.out.println(i);
  }
}
