package easy;

import java.util.Scanner;

public class StringTokens {
    /*
     * https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=false
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.length() == 0 || s.trim().length() == 0) {
            System.out.println(0);
            return;
        }
        String[] ss = s.trim().split("[!,?._'@\\s]+");
        scan.close();
        System.out.println(ss.length);
        for (String sss : ss) {
            System.out.println(sss);
        }
    }

}
