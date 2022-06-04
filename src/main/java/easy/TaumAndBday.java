package easy;

public class TaumAndBday {

  public static long taumBday(int blackNumber, int whiteNumber, int blackPrice, int whitePrice, int convertionPrice) {
    return (long) blackNumber * Math.min(blackPrice, whitePrice + convertionPrice) + (long) whiteNumber * Math.min(whitePrice, blackPrice + convertionPrice);
  }

}
