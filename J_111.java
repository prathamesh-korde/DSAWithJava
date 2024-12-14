//implementing queue by using linkedList
public class J_111 {
    static class Node{
    int data;
    Node next;

     Node(int data){
        this.data=data;
        this.next=null;
    }
}
 static class Queue{

     static Node head=null;
     static Node tail=null;
     
     public static boolean isEmpty(){
        return head==null && tail==null;
     }

     public static void add(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail=head=newNode;
            return;
        }
       
        tail.next=newNode;
        tail=newNode;

     }
     public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        if(head==tail){
            tail=null;
        }
        int front = head.data;
        head=head.next;
        return front;
     }
     public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
     }
    }
    public static void main(String[] args) {
       Queue q = new Queue();
       q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        System.out.println("printing element");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
       

    }
}