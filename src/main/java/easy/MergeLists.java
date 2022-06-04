package easy;

public class MergeLists {

    /*
     * https://leetcode.com/problems/merge-two-sorted-lists/
     * */

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


    public ListNode mergeTwoLists_it(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 != null) curr.next = list1;
        if (list2 != null) curr.next = list2;

        return res.next;
    }

    public ListNode mergeTwoLists_rec(ListNode list1, ListNode list2) {
        ListNode curr = new ListNode(0);
        rec(list1, list2, curr);
        return curr.next;
    }

    private void rec(ListNode node1, ListNode node2, ListNode result) {
        if (node1 == null && node2 == null) return;
        else if (node1 == null) {
            result.next = new ListNode(node2.val);
            rec(node1, node2.next, result.next);
        } else if (node2 == null) {
            result.next = new ListNode(node1.val);
            rec(node1.next, node2, result.next);
        } else {
            if (node1.val <= node2.val) {
                result.next = new ListNode(node1.val);
                rec(node1.next, node2, result.next);
            } else {
                result.next = new ListNode(node2.val);
                rec(node1, node2.next, result.next);
            }
        }
    }

}
