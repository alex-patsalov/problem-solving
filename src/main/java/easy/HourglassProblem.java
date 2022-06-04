package easy;

import java.util.Arrays;

/**
 * input
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * <p>
 * the output is 19
 * the sum of the biggest hourglass is 19
 */

public class HourglassProblem {

  public static void fillMultiDimArray(int[][] array) {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        array[i][j] = (int) (Math.random() * 10);
      }
    }
  }

  public static int findMax(int[][] array) {
    int maxSum = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        maxSum = Math.max(maxSum,
                array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]);
      }
    }
    return maxSum;
  }

  public static int findMax2(int[][] array) {
    int maxSum = 0;
    int total;

    for (int row = 0; row < array[0].length - 2; row++) {
      for (int col = 0; col < array.length - 2; col++) {

        total = array[row + 1][col + 1];

        for (int k = col; k < col + 3; k++) {
          total += array[row][k] + array[row + 2][k];
        }
        maxSum = Math.max(total, maxSum);
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[][] arr = new int[6][6];
    fillMultiDimArray(arr);
    for (int i = 0; i < 6; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }
    int maxSum = findMax(arr);
    int maxSum2 = findMax2(arr);
    System.out.printf("max sum is -->> %d \nmax sum2 -->> %d", maxSum, maxSum2);

  }

}
