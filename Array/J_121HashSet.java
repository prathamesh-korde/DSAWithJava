import java.util.HashSet;
import java.util.Iterator;

public class J_121HashSet{
     public static void main(String args[]) {
       HashSet<Integer> set = new HashSet<>();
      
       //Add O(1)
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);


       //Size
       System.out.println("size of set is : " + set.size());


       //Search   O(1)
       if(set.contains(1)) {
           System.out.println("present");
       }


       if(!set.contains(6)) {  
           System.out.println("absent");
       }


       //Delete  O(1)
       set.remove(1);
       if(!set.contains(1)) {
           System.out.println("absent");
       }


       //Print all elements(Unordered)
       System.out.println(set);


       //Iteration - HashSet does not have an order(dos't have index)
       set.add(0);
       Iterator it = set.iterator();
        while (it.hasNext()) {
           System.out.print(it.next() + ", ");
       }
       System.out.println();


       //isEmpty
       if(!set.isEmpty()) {
           System.out.println("set is not empty");
       }
   }

}