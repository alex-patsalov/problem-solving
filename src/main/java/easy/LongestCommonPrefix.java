package easy;

public class LongestCommonPrefix {

    /*
     * https://leetcode.com/problems/longest-common-prefix/
     * */

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String curStr = strs[i];
            while (curStr.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public String longestCommonPrefix2(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();
        if (strs.length == 0) return commonPrefix.toString();
        for (int i = 0; i < strs[0].length(); i++) {
            char oneChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || oneChar != strs[j].charAt(i)) return commonPrefix.toString();
            }
            commonPrefix.append(strs[0].charAt(i));
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String s = longestCommonPrefix.longestCommonPrefix2(new String[]{"flower", "flo", "flowewww", "floight"});
        System.out.println(s);
    }

}
