package easy;

import java.util.Arrays;

public class MakingAnagrams {

    // https://www.hackerrank.com/challenges/making-anagrams/problem

    public static int makingAnagrams2(String s1, String s2) {
        int common = 0;
        for (int i = 0; i < s1.length(); i++) {
            int idx = s2.indexOf(s1.charAt(i));
            if(idx > -1){
                common++;
                s2 = s2.substring(0, idx) + s2.substring(idx + 1);
            }
        }
        return s2.length() + s1.length() - common;
    }

    public static int makingAnagrams(String s1, String s2) {
        int[] freq = new int[26];
        s1.chars().forEach(c -> freq[c - 97]++);
        s2.chars().forEach(c -> freq[c - 97]--);
        return (int) Arrays.stream(freq).map(Math::abs).sum();
    }



}
