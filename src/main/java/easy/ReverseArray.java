package easy;

import java.util.Arrays;

public class ReverseArray {

  public static int[] reverse(int[] array){
    int[] reversed = new int[array.length];
    for (int i = array.length - 1, index = 0; i >= 0 && index < reversed.length; i--, index++) {
      reversed[index] = array[i];
    }
    return reversed;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(Arrays.toString(reverse(arr)));
  }

}
