package easy;

import java.util.List;

public class BonAppetit {

  public static void bonAppetit(List<Integer> bill, int doNotEat, int chargedSum) {
    bill.set(doNotEat, 0);
    Integer totalPerTwo = bill.stream().reduce((a, b) -> a + b).get();
    if (totalPerTwo / 2 == chargedSum) System.out.println("Bon Appetit");
    else System.out.println(chargedSum - totalPerTwo / 2);
  }

}
