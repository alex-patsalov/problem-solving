package easy;

public class HalvesAreAlike {
    // https://leetcode.com/problems/determine-if-string-halves-are-alike/

    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int vowelsNum = 0;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if(vowels.indexOf(s.charAt(i)) >= 0) vowelsNum++;
            if(vowels.indexOf(s.charAt(j)) >= 0) vowelsNum--;
        }
        return vowelsNum == 0;
    }
}
