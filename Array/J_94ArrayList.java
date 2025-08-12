
import java.util.ArrayList;
import java.util.Collections;

/*ArryList-
The ArrayList class is a resizable(dynamic) array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).
While elements can be added and removed from an ArrayList whenever you want.
i)Java ArrayList class is non synchronized.
ii)Java ArrayList allows random access because the array works on an index basis.
iii)In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
iv)We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.
v)Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.
*/

//insertion timeComplexity- O(n)
//searching timeComplexity- O(1)

public class J_94ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=3;i++){
            // add element
            list.add(i);
        }
        System.out.println(list);

        // get element
        int element=list.get(1);
        System.out.println(element);
         
        //add element in between
        list.add(1,5);
        System.out.println(list);
        
        //set element
        list.set(0,6);
        System.out.println(list);
        
        //delete element
        list.remove(2);
        System.out.println(list);
        
        //size
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
        
    }
}
