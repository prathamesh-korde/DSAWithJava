
import java.util.HashSet;

public class J_126Intersection {
    public static int inersection(int arr1[],int arr2[]){
        int count =0;
       HashSet<Integer> set = new HashSet<>();
       for(int val1 : arr1){
        set.add(val1);
       }
       for(int val2:arr2){
         if(set.contains(val2)){
             count++;
             set.remove(val2);
        }
    }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[]= {6,3,9,2,9,4};
       int count = inersection(arr1, arr2); 
       System.out.println(count);
    }
}
