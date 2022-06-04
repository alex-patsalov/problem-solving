package easy;

public class TowerBraker {

    // https://www.hackerrank.com/challenges/tower-breakers-1/problem

    public static int towerBreakers(int numberOfTowers, int height) {
        if (height == 1) return 2;
        return numberOfTowers % 2 != 0 ? 1 : 2; // 1 7 or 3 7
    }

}
