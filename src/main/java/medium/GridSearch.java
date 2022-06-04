package medium;

import java.util.ArrayList;
import java.util.List;

public class GridSearch {

    // https://www.hackerrank.com/challenges/the-grid-search/problem

    public static String gridSearch(List<String> grid, List<String> patterns) {
        boolean found = false;
        int patternLength = patterns.get(0).length();
        for (int row = 0, pattern = 0; row < grid.size() && pattern < patterns.size(); row++) {
            int patternIndex = grid.get(row).indexOf(patterns.get(pattern));
            if (pattern != 0) {
                if (patternIndex == -1) {
                    found = false;
                    pattern = 0;
                    row--;
                    continue;
                } else {
                    String prevPattern = patterns.get(pattern - 1);
                    String prevGridLine = grid.get(row - 1).substring(patternIndex, patternIndex + patternLength);
                    if (!prevGridLine.equals(prevPattern)) {
                        found = false;
                        pattern = 0;
                        continue;
                    }
                }
            }
            if (patternIndex != -1) {
                found = true;
                pattern++;
            }
        }
        return found ? "YES" : "NO";
    }

    // doesn't check the indices of the patterns in the grid line
    public static String gridSearchNotValid(List<String> grid, List<String> patterns) {
        List<Integer> indices = new ArrayList<>();
        List<Integer> lines = new ArrayList<>();
        int patternRowNumber = 0;
        for (int i = 0; i < grid.size() && patternRowNumber < patterns.size(); i++) {
            String matrixRow = grid.get(i);
            String patternRow = patterns.get(patternRowNumber);
            if (matrixRow.contains(patternRow)) {
                int index = matrixRow.indexOf(patternRow);
                indices.add(index);
                lines.add(i);
                patternRowNumber++;
            }
        }
        for (int i = 0; i < indices.size() - 1; i++) {
            if (indices.get(i) != indices.get(i + 1)) return "NO";
        }
        for (int i = lines.size() - 1; i > 0; i--) {
            if (lines.get(i) - lines.get(i - 1) != 1) return "NO";
        }

        return lines.size() == patterns.size() ? "YES" : "NO";
    }


}
