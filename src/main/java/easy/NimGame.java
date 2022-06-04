package easy;

import java.util.List;

public class NimGame {

    // https://www.hackerrank.com/challenges/nim-game-1/proble

    public static String nimGame(List<Integer> pile) {
        return pile.stream().reduce(0, (x, y) -> x ^ y) == 0 ? "Second" : "First";
    }
}
