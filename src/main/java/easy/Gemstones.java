package easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Gemstones {

  /*
  * https://www.hackerrank.com/challenges/gem-stones/problem
  * */

  public static int gemstones(List<String> arr) {
    int totalStrings = arr.size();
    int counter = 0;
    char[] chars = arr.stream().distinct().collect(Collectors.joining()).toCharArray();
    Set<Character> distinct = new HashSet<>();
    for (char c : chars) distinct.add(c);
    for (Character c : distinct){
      if(totalStrings == (int)arr.stream().filter(s -> s.indexOf(c) > -1).count()) counter++;
    }
    return counter;
  }

}
