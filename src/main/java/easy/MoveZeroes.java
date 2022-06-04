package easy;

import java.util.Arrays;

public class MoveZeroes {

  public static void moveZeroes(int[] array) {
    int[] mod = new int[array.length];
    int start = 0;
    int end = mod.length - 1;

    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) mod[start++] = array[i];
      else mod[end--] = array[i];
    }
    System.out.println(Arrays.toString(mod));
  }

  public static void moveZeroes2(int[] array) {
    int lastZero = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) array[lastZero++] = array[i];
    }
    for (int i = lastZero; i < array.length; i++) {
      array[i] = 0;
    }
  }

  public static void main(String[] args) {
    int[] array = {0, 1, 0, 3, 12};
    moveZeroes(array);
  }
}
