//remove n th node from the laast of the linked list
public class J_100{
    Node head;
    private int size=0;
    class Node{
        String data;
        Node next;
    
    Node(String data){
        this.data=data;
        this.next=null;
        size++;

    }
}
//add node frome starting
    public void addFirst(String data) {
        Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
     }
     
     //print the list
     public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("null");
        
     }
     public int printSize(){

        return size;
     }
     //removre nth node from last
     public Node removeNth(int n,int size){
        if(head==null){
            System.out.println("list is empty");
            return null;
        }  
        if(n>size || n<=0){
            System.out.println("invalid input");

            return null;
        }

        int idxToSearch = size-n;
        Node previousNode = head;
         int i=1;
         if (idxToSearch == 0) {
            head = head.next;
            size--;
            return head;
        }
        while(i<idxToSearch){
            previousNode=previousNode.next;
            i++;
        }
        previousNode.next=previousNode.next.next;
        return head;
     }
public static void main(String[] args) {
    J_100 list = new J_100(); 
    list.addFirst("5");
    list.addFirst("4");
    list.addFirst("3");
    list.addFirst("2");
    list.addFirst("1");
    list.printList();
    int size= list.size;
    int n =5;
    list.removeNth(n, size);
    list.printList();
}
}