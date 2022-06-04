package sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortP2 {

  public static int insertionSort2(List<Integer> arr1) { // 1 2 4 5 3
    int swaps = 0;
    List<Integer> arr = new ArrayList<>(arr1);
    for (int i = 1; i < arr.size(); i++) {
      int element = arr.get(i);
      for (int j = i - 1; j >= 0; j--) {
        if(arr.get(j) > element){
          int temp = arr.get(j);
          arr.set(j, element);
          arr.set(j + 1, temp);
          swaps++;
        }
      }
      print(arr);
    }
    return swaps;
  }

  private static void print(List<Integer> arr) {
    arr.stream().map(i -> i + " ").forEach(System.out::print);
    System.out.println();
  }

  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 4, 3, 5, 6, 2);
    insertionSort2(integers);
  }

}
