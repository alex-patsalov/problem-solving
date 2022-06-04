package easy;

public class PalindromIndex {

    // https://www.hackerrank.com/challenges/palindrome-index/problem

    public static int palindromeIndex(String s) {
        int idx = -1;
        if (isValid(s)) return idx;
        else {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    String s1 = s.substring(0, i) + s.substring(i + 1);
                    if (isValid(s1)) idx = i;
                    else idx = s.length() - 1 - i;
                    break;
                }
            }
            return idx;
        }
    }

    private static boolean isValid(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

}
