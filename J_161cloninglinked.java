
import java.util.HashMap;
import java.util.Map;

class ListNode {

    int data;
    ListNode next;
    ListNode random;

    ListNode(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class J_161cloninglinked {

    public ListNode cloneLinkedList(ListNode head) {
        if (head == null) {
            return null;
        }

        Map<ListNode, ListNode> nodeMap = new HashMap<>();
        ListNode temp = head;

        while (temp != null) {
            nodeMap.put(temp, new ListNode(temp.data));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            ListNode clonedNode = nodeMap.get(temp);
            clonedNode.next = nodeMap.get(temp.next);
            clonedNode.random = nodeMap.get(temp.random);
            temp = temp.next;
        }

        return nodeMap.get(head);
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;
        head.random = third;
        second.random = head;
        third.random = second;

        System.out.println("Original Linked List:");
        printList(head);

        J_161cloninglinked solution = new J_161cloninglinked();
        ListNode clonedHead = solution.cloneLinkedList(head);

        System.out.println("\nCloned Linked List:");
        printList(clonedHead);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print("Node data: " + temp.data);
            if (temp.random != null) {
                System.out.print(", Random points to: " + temp.random.data);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            temp = temp.next;
        }
    }
}
