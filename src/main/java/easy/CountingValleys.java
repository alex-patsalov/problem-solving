package easy;

public class CountingValleys {

  public static int countingValleys(String path) {
    int valley = 0;
    int seaLevel = 0;
    for (char c : path.toCharArray()) {
      if (c == 'U') seaLevel++;
      else seaLevel--;

      if (seaLevel == 0 && c == 'U') valley++;
    }
    return valley;
  }

}
