package easy;

public class HalloweenSale {

  public static int howManyGames(int price, int discount, int minimumPrice, int totalBudget) {
    int numberOfGames = 0;
    if (totalBudget < price) return 0;
    while (totalBudget >= price) {
      numberOfGames++;
      totalBudget -= price;
      price = Math.max(price - discount, minimumPrice);
    }
    return numberOfGames;
  }

}
