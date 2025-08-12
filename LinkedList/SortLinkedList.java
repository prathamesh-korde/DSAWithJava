import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node segregate(Node head) {
        LinkedList<Integer> list = new LinkedList<>();
        Node temp = head;

        
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(list);

        temp = head;
        int index = 0;
        while (temp != null) {
            temp.data = list.get(index++);
            temp = temp.next;
        }

        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original list:");
        printList(head);

        head = segregate(head);

        System.out.println("Sorted list:");
        printList(head);
    }
}
