

 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LoopLength {
    public int countNodesinLoop(Node head) {
        if (head == null) {
            return 0;
        }

        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return countLoopNodes(turtle);
            }
        }

        return 0; 
    }

    private int countLoopNodes(Node nodeInLoop) {
        int count = 1;
        Node current = nodeInLoop;

        while (current.next != nodeInLoop) {
            count++;
            current = current.next;
        }

        return count;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;

        LoopLength LL = new LoopLength();
        int loopLength = LL.countNodesinLoop(head);

        System.out.println("Length of the loop is: " + loopLength);
    }
}
