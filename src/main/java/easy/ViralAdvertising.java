package easy;

public class ViralAdvertising {

  public static int viralAdvertisingIt(int n) {
    int liked;
    int people = 5;
    int total = 0;
    for (int i = 0; i < n; i++) {
      liked = people / 2;
      total += liked;
      people = liked * 3;
    }
    return total;
  }

  public static int viralAdvertisingR(int n) {
    return rec(n, 0, 5);
  }

  public static int rec(int n, int total, int people) {
    if (n == 0) return total;
    int liked = people / 2;
    total += liked;
    people = liked * 3;
    return rec (n - 1, total, people);
  }

}
