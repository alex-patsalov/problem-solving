package easy;

public class MarsExploration {

  //  https://www.hackerrank.com/challenges/mars-exploration/problem

  public static int marsExploration(String s) {
//    char[] pattern = {'S', 'O', 'S'};
    String sos = "SOS";
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != sos.charAt(i % 3)) count++;
//      if (s.charAt(i) != pattern[i % 3]) count++;
    }
    return count;
  }
  
}
