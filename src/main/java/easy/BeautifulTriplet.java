package easy;

import java.util.List;

public class BeautifulTriplet {

  public static int beautifulTriplets(int d, List<Integer> arr) {
    return (int) arr.stream().filter(i -> arr.contains(i + d) && arr.contains(i + 2 * d)).count();
  }

}
