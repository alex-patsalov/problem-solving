package easy;

public class StrangeCounter {

  public static long strangeCounter2(long order) {
    long start = 3;
    long curr = start;
    long index = 1;
    while (index < order) {
      if (curr == 1) {
        start *= 2;
        curr = start;
        index++;
        continue;
      }
      curr--;
      index++;
    }

    return curr;
  }

  public static long strangeCounter(long time) {
    long start = 3;
    while (time > start) {
      time = time - start;
      start *= 2;
    }
    return start - time + 1;
  }

}
