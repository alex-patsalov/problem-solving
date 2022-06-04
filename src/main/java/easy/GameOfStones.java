package easy;

public class GameOfStones {

    // https://www.hackerrank.com/challenges/game-of-stones-1/problem

    public static String gameOfStones(int n) {
        return n % 7 > 1 ? "First" : "Second";
    }

}
