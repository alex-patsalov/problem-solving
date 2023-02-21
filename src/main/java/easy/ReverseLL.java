package easy;

public class ReverseLL<T> {

    private Node head;  // Head is the first node in linked list

    public void append(T data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    private Node tail() {
        Node tail = head;

        // Find last element of linked list known as tail
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current).append("-->");
            current = current.next;
        }
        if (sb.length() >= 3) {
            sb.delete(sb.length() - 3, sb.length());
            // to remove --> from last node
        }

        return sb.toString();
    }

    /**
     * Reverse linked list using 3 pointers approach in O(n) time
     * It basically creates a new list by reversing direction, and
     * subsequently insert the element at the start of the list.
     */
    public void reverseIteratively() {
        Node current = head;
        Node previous = null;
        Node forward = null;

        // traversing linked list until there is no more element
        while (current.next != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        head = current;
        head.next = previous;
    }

    /*
     * Reverse a singly linked list using recursion. In recursion Stack is
     * used to store data.
     * 1. Traverse linked list till we find the tail,
     * that would be new head for reversed linked list.
     */
    private Node reverseRecursively(Node node) {
        Node newHead;

        //base case - tail of original linked list
        if ((node.next == null)) {
            return node;
        }
        newHead = reverseRecursively(node.next);

        //reverse the link e.g. C->D->null will be null
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public void reverseRecursively() {
        head = reverseRecursively(head);
    }

    public void removeDuplicate() {
        Node current = head;
        Node prev = null;
        Node index = null;

        while (current != null) {
            prev = current;
            index = current.next;
            while (index != null) {
                if (current.data == index.data) {
                    prev.next = index.next;
                } else prev = index;
                index = index.next;
            }
            current = current.next;
        }
        
    }

    private class Node {
        private Node next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public static void main(String[] args) {
        ReverseLL<String> list = new ReverseLL<>();
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("C");
        list.append("D");
        list.removeDuplicate();
        System.out.println(list.toString());
    }

}
