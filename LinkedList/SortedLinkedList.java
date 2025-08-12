
public class SortedLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node crr, int ctr, int len) {
        if (ctr == len - 1) {
            return crr;
        }
        Node nextNode = crr.next;
        while (nextNode != null) {
            if (crr.data > nextNode.data) {
                int temp = crr.data;
                crr.data = nextNode.data;
                nextNode.data = temp;
            }
            nextNode = nextNode.next;
        }

        reverseList(crr.next, ctr + 1, len);
        return crr;
    }

    public static int countLen(Node head1, int len) {
        Node crr = head1;
        while (crr != null) {
            crr = crr.next;
            len++;
        }
        return len;
    }

    public Node sortedMerge(Node head1, Node head2) {
        Node current = head1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head2;

        int length = countLen(head1, 0);
        return reverseList(head1, 0, length);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

       
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        SortedLinkedList list = new SortedLinkedList();
        Node mergedHead = list.sortedMerge(head1, head2);

      
        printList(mergedHead);
    }
}
