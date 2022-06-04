package easy;

import java.util.HashSet;
import java.util.List;

public class StringConstruction {

  //https://www.hackerrank.com/challenges/string-construction/problem

  public static int stringConstruction(String s) {

    return new HashSet<String>(List.of(s.split(""))).size();

  }

}
