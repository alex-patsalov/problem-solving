package easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ints = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return ints.size() != nums.length;
    }
}
