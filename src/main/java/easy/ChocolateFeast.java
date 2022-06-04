package easy;

public class ChocolateFeast {

  public static int chocolateFeast(int money, int barCost, int numberToTrade) {
    int chocolates = money / barCost;
    int eaten = 0;
    int wrappers = 0;
    while (chocolates > 0) {
      eaten += chocolates;
      wrappers += chocolates;
      chocolates = wrappers / numberToTrade;
      wrappers = wrappers % numberToTrade;
    }
    return eaten;
  }

}
