package easy;

import java.util.ArrayList;
import java.util.List;

public class ACMTeam {

  public static List<Integer> acmTeam(List<String> array) {
    List<Integer> res = new ArrayList<>();
    int maxTopic = 0;
    int maxTeam = 0;
    int currTopic = 0;
    for (int i = 0; i < array.size() - 1; i++) {
      char[] charsL = array.get(i).toCharArray();
      for (int j = i + 1; j < array.size(); j++) {
        currTopic = 0;
        char[] charsR = array.get(j).toCharArray();
        for (int k = 0; k < charsR.length; k++) {
          if (charsR[k] == '1' || charsL[k] == '1') currTopic++;
          if (currTopic > maxTopic) {
            maxTopic = currTopic;
            maxTeam = 1;
          }
          else if (currTopic == maxTopic) maxTeam++;
        }
      }
    }
    res.add(maxTopic);
    res.add(maxTeam);
    return res;
  }
}
