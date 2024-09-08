package medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesLL {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // 1 1 1 2 3 3 4 5 5 -> 2 4
    public static ListNode deleteDuplicates2(ListNode head) {
        Map<Integer, Integer> occurance = new LinkedHashMap<>();
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        while (curr != null) {
            occurance.merge(curr.val, 1, (v1, v2) -> v1 + 1);
            curr = curr.next;
        }
        int min = findMin(occurance);
        if (min == -1000) return null;
        ListNode node = new ListNode(min);
        ListNode current = node;
        for (Map.Entry<Integer, Integer> entry : occurance.entrySet()) {
            if (entry.getKey() == min) {
                continue;
            } else if (entry.getValue() == 1) {
                current.next = new ListNode(entry.getKey());
                current = current.next;
            }

        }
        return node;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = dummyHead;
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }
        return dummyHead.next;
    }

    private static int findMin(Map<Integer, Integer> array) {
        int res = -1000;
        for (Map.Entry<Integer, Integer> entry : array.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(5);

//        ListNode node = new ListNode(-3);
//        node.next = new ListNode(-1);

//        ListNode node = new ListNode(0);
//        node.next = new ListNode(1);
//        node.next.next = new ListNode(2);
//        node.next.next.next = new ListNode(2);
//        node.next.next.next.next = new ListNode(3);
//        node.next.next.next.next.next = new ListNode(4);
        ListNode res = deleteDuplicates(node);
        System.out.println(res);
    }

}
