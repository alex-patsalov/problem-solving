package easy;

public class AppendAndDelete {

  public static String appendAndDelete(String initial, String target, int moves) {
    int common;
    for (common = 0; common < initial.length() && common < target.length(); common++) {
      if (initial.charAt(common) != target.charAt(common)) break;
    }
    int diff1 = initial.length() - common;
    int diff2 = target.length() - common;
    int res = moves - diff1 - diff2;
    if (res % 2 == 0 || res / 2 > common) return "Yes";
    else if (res < 0) return "No";
    else return "No";
  }

}


