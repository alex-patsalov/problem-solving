package easy;

//https://www.hackerrank.com/challenges/weighted-uniform-string/problem

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WeightedString {

  /*
  * https://www.hackerrank.com/challenges/weighted-uniform-string/problem
  * */

  public static List<String> weightedUniformStrings(String str, List<Integer> queries) {
    List<String> res = new ArrayList<>();
    HashSet<Integer> allWeights = new HashSet<>();
    int currWeight = 0;
    char prevChar = '0';
    for (int i = 0; i < str.length(); i++) { // aaabbbbcccddd
      char currChar = str.charAt(i);
      if (currChar != prevChar) currWeight = 0;
      currWeight += currChar - 'a' + 1;
      allWeights.add(currWeight);
      prevChar = currChar;
    }

    for (Integer q : queries) {
      if (allWeights.contains(q)) res.add("Yes");
      else res.add("No");
    }
    return res;
  }

}
