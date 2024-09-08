package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BucketSort {

    private static void sort() {
        List<Integer> array = List.of(3, 1, 2, 4, 8, 9, 6, 5, 7, 10);
        System.out.println("Before: " + array.toString());
        int bucketSize = (int)Math.sqrt(array.size());
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketSize; i++) {
            buckets.add(new ArrayList<>());
        }
        int maxNumber = max(array);
        for (Integer number : array){
            int bucket = indentifyBucket(number, maxNumber, bucketSize);
            buckets.get(bucket).add(number);
        }
        for (List<Integer> subArray : buckets){
            subArray.sort(Comparator.naturalOrder());
        }

        List<Integer> res = buckets.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
        System.out.println("After: " + res.toString());

    }

    private static int max(List<Integer> array){
        return array.stream().max(Comparator.naturalOrder()).get();
    }

    private static int indentifyBucket(int number, int max, int numberOfBuckets){
        return (int) ((double) number / max * (numberOfBuckets - 1));
    }

    public static void main(String[] args) {
        sort();
    }

}
