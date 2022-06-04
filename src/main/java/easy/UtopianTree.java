package easy;

public class UtopianTree {

  public static int utopianTreeIt(int n) {
    int height = 1;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) height *= 2;
      else height += 1;
    }

    return height;
  }

  public static int utopianTreeR(int n) {
    int height = 0;
    if (n == 0) return 1;
    else if (n % 2 == 1) height = height + (2 * utopianTreeR(n - 1));
    else height = height + (1 + utopianTreeR(n - 1));
    return height;
  }

  public static int utopianTree(int n) {
    return rec(n, 1);
  }

  public static int rec(int n, int height) {
    if (n == 0) return 1;
    if (n % 2 != 0) return 2 * rec(n - 1, height);
    else return 1 + rec(n - 1, height);
  }
}
