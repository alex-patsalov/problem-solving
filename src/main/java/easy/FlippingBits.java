package easy;

public class FlippingBits {

    // https://www.hackerrank.com/challenges/flipping-bits/problem

    public static long flippingBits(long n) {
        long result = (long) Math.pow(2, 32) - 1;
        return result ^ n;
    }

}
