package easy;

public class SaveThePrisoner {

  public static int saveThePrisoner(int prisoners, int sweets, int startAt) {
    int last = (startAt + sweets - 1) % prisoners;
    if (last == 0) last = prisoners;
    return last;
  }

}
