package easy;

public class KangarooJump {

  public static String kangaroo(int k1, int v1, int k2, int v2) {
    int pos1 = k1;
    int pos2 = k2;
    if (k1 <= k2 && v2 >= v1) return "NO";
    while (true) {
      pos1 += v1;
      pos2 += v2;
      if (pos1 == pos2) return "YES";
      else if ((pos1 > pos2 && v1 > v2) || (pos2 > pos1 && v2 > v1)) return "NO";
    }
  }

}
