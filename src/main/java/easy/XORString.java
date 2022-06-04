package easy;

import java.util.Scanner;

public class XORString {

    // https://www.hackerrank.com/challenges/strings-xor/problem

    public static String xorString(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) sb.append("0");
            else sb.append("1");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(xorString(s1, s2));
    }

}
