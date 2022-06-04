package easy;

public class SherlockAndTheBeast {

    // https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem

    public static void decentNumber(int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i >= 0; i--) {
            if (i % 3 == 0 && (n - i) % 5 == 0) {
                res.append("5".repeat(i));
                res.append("3".repeat(n - i));
                break;
            }
        }
        if(res.length() == 0) System.out.println("-1");
        else System.out.println(res);

    }

}
