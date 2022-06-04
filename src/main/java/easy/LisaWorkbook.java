package easy;

import java.util.List;

public class LisaWorkbook {

  /**
   * @return number of unique problems (problem 3 on page 3, problem 5 on page 5, etc.)
   */
//  k = 3
//  arr = [4, 2, 6, 1, 10]
  public static int workbook(int numberOfChapters, int numberOfProblemsPerPage, List<Integer> problemsInChapters) {
    int uniqueProblems = 0;
    int page = 1;
    for (Integer totalProblemsInChapter : problemsInChapters) {
      for (int problem = 1; problem <= totalProblemsInChapter; problem++) {

        if (problem == page) uniqueProblems++;
        if ((problem % numberOfProblemsPerPage == 0) || problem == totalProblemsInChapter) page++;

      }
    }
    return uniqueProblems;
  }


}
