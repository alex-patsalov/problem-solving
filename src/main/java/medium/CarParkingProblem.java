package medium;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CarParkingProblem {

  public static int countMinRoof(int[] cars, int k) {
    Arrays.sort(cars);
    int totalLength = cars.length;
    int minLength = cars[cars.length - 1] - cars[0] + 1;
    System.out.printf("total length: %d, min length: %d\n", totalLength, minLength);
    for (int i = 0; i < totalLength - k + 1; i++) {
      int len = cars[i + k - 1] - cars[i] + 1;
      minLength = Math.min(len, minLength);
    }
    return minLength;
  }

  public static long countMinRoof2(int[] cars, int k){
    return IntStream.range(0, cars.length - k + 1)
            .mapToLong(idx -> cars[idx + k - 1] - cars[idx] + 1)
            .min()
            .orElseThrow();
  }

  public static void main(String[] args) {
    int[] arr = {2,6,7,12};
    long l = countMinRoof2(arr, 3);
  }

}
