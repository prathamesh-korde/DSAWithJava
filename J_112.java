//implementng queue by using collection frameWorks in java
import java.util.ArrayDeque;
import java.util.Queue;

public class J_112 {
    public static void main(String[] args) {
       // Queue<Integer> q = new LinkedList<>();
       //Queue is an interface in java thus we can't make object of interface thus we use LinkedList<>() or ArrayDeque<>() for implementing Queue
       Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       
       while(!q.isEmpty()){
         System.out.println(q.peek());
         q.remove();
       }
        }

    }
    
