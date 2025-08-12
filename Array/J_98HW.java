import java.util.LinkedList;
import java.util.Scanner;

/*Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
Delete all nodes which have values greater than 25.
 */

public class J_98HW {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of element you want to enter");
        int n = sc.nextInt();
        System.out.println("enter no in range of 1-50");
        for(int i=0 ; i<n ; i++){
            list.add(sc.nextInt());
        }

        
        for( int i= 0 ; i < list.size();i++){
            if(list.get(i)>25){
                list.remove(i);
            }
        }
        System.out.println("remaining linked list element"+list);
    }
    
}
