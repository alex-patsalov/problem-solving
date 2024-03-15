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

    public boolean[] findWords2(String[] words) {
        String[] lines = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int linesIndex = 0;
        boolean[] res = new boolean[words.length];
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            for (int i = 0; i < word.length() && linesIndex < lines.length; ) {
                String currLine = lines[linesIndex];
                char currChar = word.toLowerCase().charAt(i);
                if (currLine.indexOf(currChar) == -1) {
                    linesIndex++;
                    i = 0;
                    continue;
                }
                if (i == word.length() - 1) {
                    res[j] = true;
                }
                i++;
            }
            linesIndex = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        boolean[] words = new FindWords().findWords2(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        String[] words2 = new FindWords().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));
    }

}
