//Make a Linked List & add the following elements to it : 
//(1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
import java.util.Arrays;
import java.util.LinkedList;
public class J_97HW {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int element = 8;
        list.addAll(Arrays.asList(1, 5, 7, 3 , 8, 2, 3));
        for(int i=0 ; i< list.size() ; i++){
            if(list.get(i)==element){
                System.out.println(i);
            }
        }
    }
    
}
