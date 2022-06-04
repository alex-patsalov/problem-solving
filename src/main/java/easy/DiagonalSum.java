package easy;

public class DiagonalSum {

  public static int[][] matrix = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
  public static int[][] matrix2 = {{1,2,3}, {1,2,3}, {1,2,3}};
// 7 3 1 9
// 3 4 6 9
// 6 9 6 6
// 9 5 8 5

//  1 2 3
//  1 2 3
//  1 2 3

  public static int countSum(int[][] matrix) {
    int sum = 0;
    for (int y = 0; y < matrix.length; y++) {
      for (int x = 0, xt = matrix[y].length - 1; x < matrix[y].length && xt >= 0; x++, xt--) {
        if (y == x) sum += matrix[y][x];
        if (y + xt == matrix[y].length - 1) sum += matrix[y][xt];
        if (x == xt && x == y) sum -= matrix[y][x];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(countSum(matrix2));
  }

}
