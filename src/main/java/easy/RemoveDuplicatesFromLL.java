package easy;

public class RemoveDuplicatesFromLL {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public class ListNode {
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

    public ListNode deleteDuplicates_it(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        return deleteDuplicates_rr(head, curr);
    }
    public ListNode deleteDuplicates_rr(ListNode head, ListNode curr) {
        if (curr == null || curr.next == null) {
            return head;
        }
        if (curr.val == curr.next.val){
            curr.next = curr.next.next;
        } else {
            curr = curr.next;
        }
        deleteDuplicates_rr(head, curr);
        return head;
    }
}
