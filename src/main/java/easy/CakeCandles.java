package easy;

import java.util.List;

public class CakeCandles {

  public static int birthdayCakeCandles(List<Integer> candles) {
    int max = candles.stream().mapToInt(i -> i).max().getAsInt();
    return (int)candles.stream().filter(i -> i.equals(max)).count();

  }

}
