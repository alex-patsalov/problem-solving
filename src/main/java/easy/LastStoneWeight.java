package easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    //    https://leetcode.com/problems/last-stone-weight/
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : stones) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();
            if (x != y) queue.add(y - x);
        }
        return queue.size() == 1 ? queue.poll() : 0;
    }

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int[] array = {2,4,7,8,1,1};
        lastStoneWeight.lastStoneWeight(array);
    }

}
