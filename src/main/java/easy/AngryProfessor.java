package easy;

import java.util.List;

public class AngryProfessor {

  public static String angryProfessor(int k, List<Integer> a) {
    return a.stream().filter(s -> s <= 0).count() >= k ? "NO" : "YES";
  }

}
