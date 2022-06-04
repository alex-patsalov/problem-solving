package easy;

public class DrawingBook {

  public static int pageCount(int totalPages, int pageTo) {
    int fromStart = 1 + (pageTo - 1) / 2 - (pageTo % 2);
    int fromEnd = totalPages / 2 - fromStart;

    return Math.min(fromEnd, fromStart);
  }

}
