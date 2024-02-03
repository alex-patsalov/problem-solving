package medium;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupeLL {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(0);
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.traversalLL();
        System.out.println();
        partition(ll, 2);
        ll.traversalLL();
    }

    public static LinkedList partition(LinkedList ll, int x) {
        Node curr = ll.head;
        ll.tail = ll.head;
        while (curr != null){
            Node next = curr.next;
            if(curr.value < x){
                curr.next = ll.head;
                ll.head = curr;
            } else {
                ll.tail.next = curr;
                ll.tail = curr;
            }
            curr = next;
        }
        return ll;
    }

    public static Node nthToLast(LinkedList list, int pos){
        Node curr = null;
        int size = list.size;
        if(size > 0){
            if(pos <= size){
                curr = list.head;
                for (int i = 0; i < size - pos; i++) {
                    curr = curr.next;
                }
            } else {
                return list.head;
            }

        }
        return curr;
    }

    private static void deleteDups(LinkedList list) {
        Set<Integer> unique = new HashSet<>();
        Node curr = list.head;
        unique.add(curr.value);
        while (curr.next != null){
            if(unique.contains(curr.next.value)){
                curr.next = curr.next.next;
                list.size--;
            } else unique.add(curr.next.value);
            curr = curr.next;
        }

    }

    public static class Node {
        public Integer value;
        public Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    public static class LinkedList {
        public Node head;
        public Node tail;
        public Integer size;

        public void createLL(int nodeValue) {
            Node newNode = new Node();
            newNode.value = nodeValue;
            newNode.next = null;
            head = newNode;
            tail = newNode;
            size = 1;
        }

        public void insertNode(int nodeValue) {
            Node newNode = new Node();
            newNode.value = nodeValue;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public void traversalLL() {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }

    }
}
