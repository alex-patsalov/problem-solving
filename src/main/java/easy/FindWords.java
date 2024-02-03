package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {

    // https://leetcode.com/problems/keyboard-row/description/

    public String[] findWords(String[] words) {
        List<String> lines = List.of("qwertyuiop", "asdfghjkl", "zxcvbnm");
        int linesIndex = 0;
        List<String> res = new ArrayList<>();
        for (String word : words) {
            for (int i = 0; i < word.length() && linesIndex < lines.size(); ) {
                String currLine = lines.get(linesIndex);
                char currChar = word.toLowerCase().charAt(i);
                if (currLine.indexOf(currChar) == -1) {
                    linesIndex++;
                    i = 0;
                    continue;
                }
                if (i == word.length() - 1) {
                    res.add(word);
                }
                i++;
            }
            linesIndex = 0;
        }
        return res.toArray(new String[]{});
    }

    public static void main(String[] args) {
        String[] words = new FindWords().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        System.out.println(Arrays.toString(words));
    }

}
