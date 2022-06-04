package easy;

public class KaprekarNumber {

  public static void kaprekarNumbers(int p, int q) {
    boolean found = false;
    for (long i = p; i <= q; i++) {
      long squared = i * i;
      String squaredString = String.valueOf(squared);
      String l = squaredString.substring(0, squaredString.length() / 2);
      String r = squaredString.substring(squaredString.length() / 2);
      long numL = (l.isEmpty()) ? 0 : Integer.parseInt(l);
      long numR = (r.isEmpty()) ? 0 : Integer.parseInt(r);
      if(numL + numR == i){
        found = true;
        System.out.print(i + " ");
      }
    }
    if(!found){
      System.out.println("INVALID RANGE");
    }
  }
}
