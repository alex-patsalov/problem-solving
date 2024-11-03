package easy;

import java.util.*;

public class FirstUniqueCharacter {

    // https://leetcode.com/problems/first-unique-character-in-a-string/

    // loveleetcode -> 2
    // aabb -> -1
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        String str = "cccaabb";
        int index = firstUniqueCharacter.firstUniqChar(str);
        System.out.println(index);
    }

}
