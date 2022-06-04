package easy;

public class TimeConversion {

  public static String timeConversion(String s) {
    String res = "";
    String[] split = s.split(":");
    String hh = split[0];
    String mm = split[1];
    String ss = split[2].substring(0, 2);
    String AMPM = split[2].substring(2, 4);
    if (AMPM.equals("AM") && hh.equals("12")) {
      res = String.format("%s:%s:%s", "00", mm, ss);
    } else if (AMPM.equals("PM") && hh.equals("12")) {
      res = String.format("%s:%s:%s", "12", mm, ss);
    } else if (AMPM.equals("PM")) {
      res = String.format("%d:%s:%s", Integer.parseInt(hh) + 12, mm, ss);
    } else res = String.format("%s:%s:%s", hh, mm, ss);
    return res;
  }

}
