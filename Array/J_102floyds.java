

public class J_102floyds {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next=null;
        }
    }
    
    Node head;

    public void makeCycle(Node head , int pos){
        Node temp=head;
        Node startNode=null;
        Node lastNode = null;
        int count=1;
        while(temp!=null){

            if(count==pos){
                startNode=temp;
            }
            lastNode = temp; 
            temp=temp.next;
            count++;
            
        }
        
        if (startNode != null && lastNode != null) {
            lastNode.next = startNode;  // Create the cycle by pointing the last node to startNode
        }
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

    public void removeCycle(Node haed){
        Node hare=head;
        Node turtle=head;
        while(hare!=turtle){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        turtle=head;
        while(turtle.next!=hare.next){
            turtle=turtle.next;
            hare=hare.next;
        }
        turtle.next=null;
    }

    // Floyd's Cycle Detection Algorithm
    public boolean isCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;  // Fast pointer moves two steps
            turtle = turtle.next;   // Slow pointer moves one step

            if (hare == turtle) {
               // removeCycle(hare,turtle);
                return true;  // Cycle detected
            }
        }

        return false;  // No cycle detected
    }

    public static void main(String[] args) {
        J_102floyds list = new J_102floyds();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("4");
        list.makeCycle(list.head, 3);
        
        // Checking for cycle (no cycle in this case)
        if(list.isCycle(list.head)){
            System.out.println("there is a cycle in linked list");
        }
        else{
            System.out.println("there is no cycle in linked list");
        }
       list.removeCycle(list.head);
      System.out.println("list has loop-"+list.isCycle(list.head));

    }
}
