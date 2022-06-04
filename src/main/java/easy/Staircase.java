package easy;

public class Staircase {

  public static void staircase(int n) {
    int level = n - 1;
    for (int i = 0; i < n; i++) {
      StringBuilder s = new StringBuilder();
      for (int j = 0; j < level; j++) {
        s.append(" ");
      }
      for (int j = 0; j < n - level; j++) {
        s.append("#");
      }
      level--;
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    staircase(10);
  }

}
