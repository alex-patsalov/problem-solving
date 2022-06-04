package easy;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;

public class SherlockStringProblem {

  public static final String y = "YES";
  public static final String n = "NO";

  public static HashMap<Character, Integer> stringToMap2(String string) {
    HashMap<Character, Integer> map = new HashMap<>(string.length());
    char[] chars = string.toCharArray();
    for (char c : chars) {
      map.merge(c, 1, (prev, next) -> prev + next);
    }
    return map;
  }

  public static HashMap<Character, Integer> stringToMap(String string) {
    HashMap<Character, Integer> map = new HashMap<>(string.length());
    string.chars().forEach(c->
                    map.merge((char) c, 1, (prev, next) -> prev + next)
    );
    return map;
  }

  public static HashMap<Integer, Integer> stringMapToIntMap(HashMap<Character, Integer> stringMap) {
    HashMap<Integer, Integer> intMap = new HashMap<>();
    stringMap.forEach((c, i) -> intMap.merge(i, 1, (prev, next) -> prev + next)
    );
    return intMap;
  }

  public static String isValid(HashMap<Integer, Integer> map) {
    Integer maxK = map.keySet().stream().max(Comparator.naturalOrder()).get();
    Integer minK = map.keySet().stream().min(Comparator.naturalOrder()).get();
    Integer minKValue = map.get(minK);
    Integer maxKValue = map.get(maxK);

    System.out.printf("(%d) : (%d)\n", minK, minKValue);
    System.out.printf("(%d) : (%d)\n", maxK, maxKValue);

    if (map.size() > 2) return n;
    if (map.size() == 1) return y;
    if (maxK - minK == 1 && maxKValue == 1) return y;
    if (minK == 1 && minKValue == 1) return y;

    return n;
  }

  public static boolean checkString(String s) {
    HashMap<Character, Integer> cimap = stringToMap(s);
    HashMap<Integer, Integer> iimap = stringMapToIntMap(cimap);
    String valid = isValid(iimap);
    return valid.equals(y);
  }

  public static void main(String[] args) throws IOException {
    String s = "aabbcca";
    System.out.printf("result -->> %s\n", checkString(s));
  }
}
