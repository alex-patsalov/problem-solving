package easy;

public class ImplementIndexOfStr {

//    https://leetcode.com/problems/implement-strstr/

    public static int strStr2(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length() && i + j < haystack.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                if (j == needle.length() - 1) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = strStr("a", "a");
        System.out.println(i);
    }

}
