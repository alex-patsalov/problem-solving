package easy;

import java.util.stream.IntStream;

public class SherlockAndSquares {

  public static int squares2(int a, int b) {
    return (int) IntStream.rangeClosed(a, b).boxed().filter(i -> Math.sqrt(i) % 1 == 0).count();
  }

  public static int squares3(int a, int b) {
    int counter = 0;
    for (int i = a; i <= b; i++) {
      if (Math.sqrt(i) % 1 == 0) counter++;
    }
    return counter;
  }

  public static int squares(int a, int b){
    return ((int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1);
  }
}
