package easy;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

  public static List<Integer> gradingStudentsLoop(List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
      if (grades.get(i) >= 38 && grades.get(i) % 5 >= 3) {
        grades.set(i, grades.get(i) + 5 - grades.get(i) % 5);
      }
      if (grades.get(i) < 38) grades.set(i, grades.get(i));
    }
    return grades;
  }

  public static List<Integer> gradingStudentsStream(List<Integer> grades) {
    return grades.stream().map(g -> g >= 38 && (g % 5) >= 3 ? (g - (g % 5) + 5) : g).collect(Collectors.toList());
  }
}
