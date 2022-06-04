package easy;

public class RepeatString {

  public static long repeatedString(String str, long times) {
    long count = 0;
    if(str.length() == 1) return times;
    if(!str.contains("a")) return 0;
    char[] chars = str.toCharArray();
    long numberOfStrings = times/str.length();
    long remainder = times % str.length();

    for (Character c : chars){
      if(c == 'a') count++;
    }
    count = count * numberOfStrings;
    for (int i = 0; i < remainder; i++) {
      if(chars[i] == 'a') count++;
    }
    return count;
  }

}
