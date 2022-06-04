package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpaceStations {

//  5
//  [0, 4]

  static int flatlandSpaceStations2(int cities, int[] spaceStations) {
    if (cities == spaceStations.length) return 0;
    List<Integer> distances = new ArrayList<>();

    for (int c = 0; c < cities; c++) {
      int min = Math.abs(c - spaceStations[0]);

      for (int ss : spaceStations) {
        int actualMin = Math.abs(c - ss);
        if (actualMin < min) {
          min = actualMin;
        }
      }
      distances.add(min);
    }
    return Collections.max(distances);
  }

  static int flatlandSpaceStations(int cities, int[] spaceStations) {
    if (cities == spaceStations.length) return 0;
    int max = 1;

    for (int c = 0; c < cities; c++) {
      int min = Math.abs(c - spaceStations[0]);

      for (int ss : spaceStations) {
        int actualMin = Math.abs(c - ss);
        if (actualMin < min) {
          min = actualMin;
        }
      }
      if(min > max) max = min;
    }
    return max;
  }

}
