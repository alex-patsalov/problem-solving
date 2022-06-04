package medium;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheBoard {

    // https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

    public static List<Integer> climbingLeaderboard(List<Integer> rankedPlayers, List<Integer> newPlayers) {
        List<Integer> distinctRankedPlayers = rankedPlayers.stream().distinct().collect(Collectors.toList());
        int rank = distinctRankedPlayers.size() - 1;
        List<Integer> res = new ArrayList<>();
        for (int score : newPlayers) {
            while (rank >= 0) {
                if (score >= distinctRankedPlayers.get(rank)) rank--;
                else {
                    res.add(rank + 2);
                    break;
                }
            }
            if (rank < 0) res.add(1);
        }
        return res;
    }

    public static List<Integer> climbingLeaderboard2(List<Integer> rankedPlayers, List<Integer> newPlayers) {
        List<Integer> res = new ArrayList<>();
        List<Integer> distinctPlayers = new HashSet<>(rankedPlayers).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> distinctPlayersRanks = new ArrayList<>(distinctPlayers.size());
        int rank = 1;
        for (int i = 0; i < distinctPlayers.size(); i++) {
            if (i == 0) distinctPlayersRanks.add(rank);
            else if (distinctPlayers.get(i) == distinctPlayers.get(i - 1)) distinctPlayersRanks.add(rank);
            else distinctPlayersRanks.add(++rank);
        }
        int lastRank = distinctPlayersRanks.size();
        for (int i = 0; i < newPlayers.size() && lastRank > 0; i++) {
            while (lastRank > 0) {
                if (newPlayers.get(i) == distinctPlayers.get(lastRank - 1)) {
                    res.add(lastRank);
                    break;
                } else if (newPlayers.get(i) < distinctPlayers.get(lastRank - 1)) {
                    res.add(lastRank + 1);
                    break;
                } else {
                    lastRank--;
                }
            }
            if (lastRank == 0) res.add(lastRank + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> c = new Random().ints(1, 10).limit(5).boxed().collect(Collectors.toList());
        List<Integer> c1 = new Random().ints(1, 10).limit(5).boxed().collect(Collectors.toList());
        Collections.sort(c1);
        List<Integer> sorted = c.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        climbingLeaderboard(sorted, c1);

    }


}
