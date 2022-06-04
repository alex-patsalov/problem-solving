package easy;

public class SumXor {

    // https://www.hackerrank.com/challenges/sum-vs-xor/problem

    public static long sumXor(long n) {
        int k = 0;
        for (long i = 0; i <= n; i++) if((n + i) == (n ^ i)) k++;
        return k;
    }

}
