
//import java.lang.classfile.components.ClassPrinter;



/*  LINKLEDLIST-
*node is an building block of LinkList consist two parts data and next(point to next node)
#1st node called head and last node called tail(consit NULL in next part)
i)variable size
ii)non-contiguous memory
iii)insertion timeComplexity- O(1)
iv)searching timeComplexity- O(n)


Types of LinkedList-1.singular
                    2.double
                    3.circular ("dos't consist NULL pointer as last node referes to first node)*/

                    //Creating a LinkedList class from scratch
public class J_95LinkListFromScratch {
    Node head;
    private int size;
    J_95LinkListFromScratch(){
        this.size=0;
      }
    class Node{
        String data;
        Node next;
        
        Node(String data){  //constructor
   
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add node at 1st position
    
    public void addFirst(String data) {
       Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add node at last position
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
    Node currNode = head;
    while(currNode.next!=null){
        currNode = currNode.next;
    }
    currNode.next = newNode;

    }         
    //print list
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
       Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }    
    
    //delete 1st node
    public void deleteFirst(){
        if(head==null){  //corner case
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;                  
    }

    //delete last node
    public void deleteLast(){
        if(head==null){  //corner case
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        
    Node secondLast = head;
    Node lastNode = head.next;
    while (lastNode.next != null){

        lastNode = lastNode.next;
        secondLast=secondLast.next;

    }
    secondLast.next = null;
     }
public int getSize(){
    return size;
}

//reverse linkedList by iterative
public void reverseIterate(){
    if(head==null || head.next==null){
        return;
    }

    Node prevNode = head;
    Node currNode = head.next;
    while(currNode != null){
        Node nextNode = currNode.next;
        currNode.next=prevNode;

        //update
        prevNode = currNode;
        currNode = nextNode;

    }
    head.next = null;
    head = prevNode;          
    
}

//reverse linkedList by Recrussion
public Node reverseListRecursive(Node head) {
    //empty node || last node or only one node
    if(head == null || head.next == null) {
        return head;
    }


    Node newHead = reverseListRecursive(head.next);
   
    head.next.next = head;
    head.next = null;
    return newHead;
}

    public static void main(String[] args) {
        J_95LinkListFromScratch list = new J_95LinkListFromScratch();
      /*   list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

       System.out.println( list.getSize());
       list.addLast("list");
       System.out.println( list.getSize());
       
       */
      

      list.addLast("1");
      list.addLast("2");
      list.addLast("3");
      list.addLast("4");

      list.printList();
       
     list.reverseIterate();
   //list.head = list.reverseListRecursive(list.head);
      list.printList();
    // System.out.println(list.head);
    }
}
