import java.util.*;
public class MergeList {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node mergeKLists(List<Node> arr) {
        if (arr == null || arr.isEmpty()) return null; 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Node list : arr) {
            while (list != null) {
                pq.add(list.data);
                list = list.next;
            }
        }
        if (pq.isEmpty()) return null;
        Node res = new Node(pq.poll());
        Node crr = res;

        while (!pq.isEmpty()) {
            crr.next = new Node(pq.poll());
            crr = crr.next;
        }
        
        return res;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeList ml = new MergeList();

        List<Node> arr = new ArrayList<>();
        
        Node list1 = new Node(1);
        list1.next = new Node(4);
        list1.next.next = new Node(5);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node list3 = new Node(2);
        list3.next = new Node(6);

        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        Node mergedHead = ml.mergeKLists(arr);
        ml.printList(mergedHead);
    }
}
