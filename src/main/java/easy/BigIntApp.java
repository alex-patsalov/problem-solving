package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger a = sc.nextBigInteger();
    BigInteger b = sc.nextBigInteger();
    BigInteger add = a.add(b);
    BigInteger multiply = a.multiply(b);
    System.out.println(add);
    System.out.println(multiply);
  }
}
