package easy;

public class BeautifulBinaryString {

    // https://www.hackerrank.com/challenges/beautiful-binary-string/problem

    public static int beautifulBinaryString2(String str) {
        char[] chars = str.toCharArray();
        int changes = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i] == 1 && chars[i - 1] == 0 && chars[i + 1] == 0) {
                chars[i + 1] = '1';
                changes++;
            }
        }
        return changes;
    }

    public static int beautifulBinaryString(String str) {
        return (str.length() - str.replaceAll("010", "").length())/3;
    }

}
