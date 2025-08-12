//Insert in Sorted Circular Linked List
/*
 Given a sorted circular linked list, the task is to insert a new node in this circular linked list so that it remains a sorted circular linked list. 
 */

public class InsertCircularList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node current = head;

        if (data <= head.data) {
            
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            return newNode; 
        }

        while (current.next != head && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        InsertCircularList list = new InsertCircularList();

        Node head = null;

        head = list.sortedInsert(head, 20);
        head = list.sortedInsert(head, 10);
        head = list.sortedInsert(head, 30);
        head = list.sortedInsert(head, 25);
        head = list.sortedInsert(head, 5);

        printCircularList(head);
    }

    public static void printCircularList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
