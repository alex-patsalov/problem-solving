package easy;

public class ReverseStringApp {

  public static String opt1(String str){
    return new StringBuilder(str).reverse().toString();
  }

  public static String opt2(String str){
    String result = "";
    char[] chars = str.toCharArray();
    for (int i = chars.length - 1; i >=0; i--) {
      result += chars[i];
    }
    return result;
  }

  public static String opt3(String str){
    String res = "";
    for (int i = str.length() - 1; i >= 0; i--){
      res += str.charAt(i);
    }
    return res;
  }

  public static String opt4(String str){
    String l;
    String r;
    if(str.length() <= 1){
      return str;
    }
    l = str.substring(0, str.length()/2);
    r = str.substring(str.length()/2, str.length());
    return opt4(r) + opt4(l);
  }

  public static void main(String[] args) {
    String s = opt4("12345");
    System.out.println(s);
  }
}
