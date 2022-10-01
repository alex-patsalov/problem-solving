package easy;

public class ClimbStairs {

    public int climbStairs(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        if (n < 2) return array[n];
        array[2] = 2;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

}
