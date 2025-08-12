//swap the adjustent node of linked list
public class J_103 {
    class Node {
        int data;
        Node next;

        Node(int data) {
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
    public void addFirst(int data) {
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

    

    public void replaceAdj(Node head){

        if(head==null || head.next==null){
            return;
        }

        Node first = head;
        Node sec = head.next;

        while(first != null && sec != null){

           
           int temp=first.data;
            first.data=sec.data;
            sec.data=temp;


            first=first.next.next;
            if(first!=null){
                sec=sec.next.next;
            }
            System.out.println("List after swapping adjacent nodes:");
            printList();

        }
    }
    public static void main(String[] args) {
        J_103 list = new J_103();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.replaceAdj(list.head);
    }

}
