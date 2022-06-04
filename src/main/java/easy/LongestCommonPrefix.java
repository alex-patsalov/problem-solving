package easy;

public class LongestCommonPrefix {

  /*
   * https://leetcode.com/problems/longest-common-prefix/
   * */

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++){
      String curStr = strs[i];
      while (curStr.indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    }
    return prefix;
  }

  public String longestCommonPrefix2(String[] strs) {
    String commonPrefix = "";
    int commonIndex = 0;
    if (strs.length == 0) return commonPrefix;

    for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 1; j < strs.length; j++) {
        if (commonIndex >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) return commonPrefix;
      }
      commonIndex++;
      commonPrefix += strs[0].charAt(i);
    }
    return commonPrefix;
  }

  public static void main(String[] args) {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String s = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "fl", "flowwww", "floight"});
    System.out.println(s);
  }

}
