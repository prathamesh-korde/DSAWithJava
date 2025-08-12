//take an array as an input from user.search for a given number X and print index at which it occurs
//linear search              
import java.util.Scanner;
public class j_47arr_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array-");
        int size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("enter array element-");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();  
        }
        System.out.println("enter element you want to search-");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("element "+x+" found at index-"+i);
            }
        }

        
    }
    
}
