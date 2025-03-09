import java.util.HashMap;

public class loopdetection {
    static class Node{
        Node Next;
        int data;

        Node(int data){
            this.data=data;
            this.Next = null;
        }
    }
     public static boolean detectLoop1(Node head) {
       HashMap<Node,Integer> map = new HashMap<>();
       Node crr = head;
       while(crr!=null){
           if(map.containsKey(crr)){
               return true;
           }
           map.put(crr,1);
           crr=crr.Next;
       }
       return false;
    }

    public static boolean detectLoop2(Node head){
        if(head== null ){
            return false;
        }
        Node prv=head;
        Node nxt=head;
        while(prv!=null && nxt.Next!=null){
            prv=prv.Next;
            nxt=nxt.Next;

            if(prv==nxt){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.Next = new Node(3);
        head.Next.Next = new Node(4);

        // Create a loop
        head.Next.Next.Next = head.Next;

        if (detectLoop2(head) && detectLoop2(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
