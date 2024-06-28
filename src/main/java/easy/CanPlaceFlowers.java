package easy;

public class CanPlaceFlowers {
    // https://leetcode.com/problems/can-place-flowers/
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0 || flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (left && right){
                    flowerbed[i] = 1;
                    counter++;
                }
                if (counter >= n) break;
            }
        }
        return counter >= n;
    }

    public static void main(String[] args) {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        int[] ints = {1,0,0,0,0,1};
        boolean res = canPlaceFlowers.canPlaceFlowers(ints, 2);
        System.out.println(res);
    }

}
