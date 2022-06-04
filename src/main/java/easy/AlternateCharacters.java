package easy;

public class AlternateCharacters {

    // https://www.hackerrank.com/challenges/alternating-characters/problem
    public static int alternatingCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i + 1)) sb.append(s.charAt(i));
        }
        return s.length() - sb.toString().length();
    }
}
