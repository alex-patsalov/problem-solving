package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteFirstLetter {

  public static List<String> deleteFirstLeter(List<String> array){
    return array.stream().map(s -> s.substring(1))
            .sorted()
            .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>() {{
      add("First");
      add("Second");
      add("Third");
    }};
    System.out.println(deleteFirstLeter(arr));
  }

}
