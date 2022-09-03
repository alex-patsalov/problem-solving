package easy;

public class LengthOfTheLastWord {

    // https://leetcode.com/problems/length-of-last-word/

    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }

}
