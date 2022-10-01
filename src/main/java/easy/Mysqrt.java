package easy;

public class Mysqrt {

    // https://leetcode.com/problems/sqrtx/

    public int mySqrtBin(int x) {
        if(x == 0) return 0;
        long res = -1;
        long low = 0;
        long high = x;
        while (low <= high){
            long middle = low + (high - low) / 2;
            if(x == middle * middle) return (int)middle;
            else if (x > middle * middle){
                res = middle;
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return (int)res;
    }

    public int mySqrtIt(int x){
        if(x == 0) return 0;
        long res = 1;
        while (res * res <= x){
            res++;
        }
        return (int)res - 1;
    }

}
