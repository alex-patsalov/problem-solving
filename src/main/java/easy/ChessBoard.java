package easy;

public class ChessBoard {

    // https://www.hackerrank.com/challenges/a-chessboard-game-1/problem
    /*
     * -2 +1
     * -2 -1
     * +1 -2
     * -1 -2
     * */


    public static String chessboardGame(int x, int y) {
        return (x % 4 == 1 || x % 4 == 2) && (y % 4 == 1 || y % 4 == 2) ? "Second" : "First";
    }

}
