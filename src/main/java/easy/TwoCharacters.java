package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoCharacters {

//    https://www.hackerrank.com/challenges/two-characters/problem

    public static int alternate(String str) {
        List<Character> distinct = makeDistinct(str);
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distinct.size() - 1; i++) {
            for (int j = i + 1; j < distinct.size(); j++) {
                Character val1 = distinct.get(i);
                Character val2 = distinct.get(j);
                System.out.printf("Pair -> %s : %s \n", val1, val2);
                char[] charsArray = str.toCharArray();
                for (char c : charsArray) {
                    if (c == val1 || c == val2) sb.append(c);
                }
                boolean valid = checkString(sb.toString());
                if (valid) max = Math.max(max, sb.toString().length());
                sb = new StringBuilder();
            }
        }
        return max;
    }

    public static List<Character> makeDistinct(String str) {
        List<Character> distinct = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            distinct.add(str.charAt(i));
        }
        return distinct.stream().distinct().collect(Collectors.toList());
    }

    public static boolean checkString(String arr) {
        for (int i = 0; i < arr.toCharArray().length - 1; i++) {
            if (arr.toCharArray()[i] == arr.toCharArray()[i + 1]) return false;
        }
        return true;
    }

}
