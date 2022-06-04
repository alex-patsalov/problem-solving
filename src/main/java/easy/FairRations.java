package easy;

import java.util.List;

public class FairRations {

  public static String fairRations(List<Integer> breads) {
    int count = 0;
    Integer sum = breads.stream().reduce(Integer::sum).get();
    if(sum % 2 == 1) return "NO";
    for (int i = 0; i < breads.size() - 1; i++) {
      if(breads.get(i) % 2 != 0){
        breads.set(i, breads.get(i) + 1);
        breads.set(i + 1, breads.get(i + 1) + 1);
        count+= 2;
      }
    }
    return String.valueOf(count);
  }

}
