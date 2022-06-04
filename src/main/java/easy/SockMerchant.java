package easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchant {

  public static int sockMerchant(int n, List<Integer> colors) {
    Set<Integer> c = new HashSet<>();
    int pairs = 0;
    for (Integer i : colors){
      if(c.contains(i)){
        c.remove(i);
        pairs++;
      } else c.add(i);
    }
    return pairs;
  }

}
