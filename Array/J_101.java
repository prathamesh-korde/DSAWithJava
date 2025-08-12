public class J_101 {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next=null;
        }
    }

    Node head;

    // Find the mid of the list
    public Node FindMid(Node head) {
        Node hare = head;
        Node turtle = head;                           
        while (hare.next != null && hare != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    // Reverse the half linked list
    public Node reverse(Node head) {
        Node pre = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;  // Move to the next node
        }
        return pre;
    }

    // Check if the linked list is a palindrome
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the mid-point of the list
        Node mid = FindMid(head);
        
        // Reverse the second half of the list
        Node secStart = reverse(mid.next);

        // Compare the first half and the reversed second half
        Node firstStart = head;
        while (secStart != null) {
            if (!firstStart.data.equals(secStart.data)) {
                return false;
            }
            firstStart = firstStart.next;
            secStart = secStart.next;
        }

        return true;
    }

    // Add an element at the start of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        J_101 list = new J_101();  // Correct class name here
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();

        // Check if the list is a palindrome
        if (list.isPalindrome(list.head)) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }
    }
}
