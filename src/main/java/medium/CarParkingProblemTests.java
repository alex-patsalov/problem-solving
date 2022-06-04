package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarParkingProblemTests {

  private static CarParkingProblem cpp = new CarParkingProblem();

  @Test
  void test1() {
    int[] arr = {6, 4, 2, 11};
    int expected = 5;
    int real = cpp.countMinRoof(arr, 3);
    Assertions.assertEquals(expected, real);
  }

  @Test
  void test2() {
    int[] arr = {6, 4, 2, 11};
    int expected = 3;
    int real = cpp.countMinRoof(arr, 2);
    Assertions.assertEquals(expected, real);
  }

  @Test
  void test3() {
    int[] arr = {6, 4, 2, 11, 13, 1};
    int expected = 11;
    int real = cpp.countMinRoof(arr, 5);
    Assertions.assertEquals(expected, real);
  }

  @Test
  void test4() {
    int[] arr = {6, 4, 2, 11, 9, 13, 1};
    int expected = 6;
    int real = cpp.countMinRoof(arr, 4);
    Assertions.assertEquals(expected, real);
  }


}
