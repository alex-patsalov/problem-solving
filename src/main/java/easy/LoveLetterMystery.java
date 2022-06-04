package easy;

public class LoveLetterMystery {

    // https://www.hackerrank.com/challenges/the-love-letter-mystery/problem

    public static int theLoveLetterMystery(String s) {
        int changes = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            changes += Math.abs(s.charAt(i) - s.charAt(s.length() - 1 - i));
        }
        return changes;
    }

}
