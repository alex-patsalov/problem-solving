package sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortP1 {

  public static void insertionSort1(int size, List<Integer> arr1) { // 1 2 4 5 3
    List<Integer> arr = new ArrayList<>(arr1);
    int last = arr.get(arr.size() - 1);
    boolean swaped = false;
    for (int i = arr.size() - 2; i >= 0 && !swaped; i--) {
      if (last < arr.get(i)) {
        arr.set(i + 1, arr.get(i));
        if (i == 0) {
          arr.set(i + 1, arr.get(i));
          print(arr);
          arr.set(i, last);
          swaped = true;
        }
      } else {
        arr.set(i + 1, last);
        swaped = true;
      }
      print(arr);
    }
  }

  private static void print(List<Integer> arr) {
    arr.stream().map(i -> i + " ").forEach(System.out::print);
    System.out.println();
  }

  public static void main(String[] args) {
    List<Integer> integers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 1);
    insertionSort1(integers.size(), integers);
  }
  
}
