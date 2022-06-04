package easy;

public class Anagram {

    // https://www.hackerrank.com/challenges/anagram/problem

    public static int anagram2(String s) {
        if (s.length() % 2 == 1) return -1;
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        for (int i = 0; i < s1.length(); i++) {
            int ci = s2.indexOf(s1.charAt(i));
            if(ci > -1) s2 = s2.replaceFirst(Character.toString(s1.charAt(i)), "");
        }
        return s2.length();
    }

    public static int anagram1(String s) {
        if (s.length() % 2 != 0) return -1;
        StringBuilder a = new StringBuilder(s.substring(0, s.length() / 2));
        String b = s.substring(s.length() / 2);
        for (char c : b.toCharArray()) {
            int index = a.indexOf(String.valueOf(c));
            if (index > -1) a = a.delete(index, index + 1);
        }
        return a.length();
    }

}
