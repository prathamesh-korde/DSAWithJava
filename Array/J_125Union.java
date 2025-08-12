
import java.util.HashSet;
import java.util.Iterator;

//Union of two arrays

public class J_125Union{
    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int val1 : arr1){
            set.add(val1);
        }
        for(int val2 : arr2){
            set.add(val2);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
        
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[]= {6,3,9,2,9,4};
        union(arr1, arr2);
    }
}
