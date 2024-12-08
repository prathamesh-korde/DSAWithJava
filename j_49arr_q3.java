//Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.Scanner;
public class j_49arr_q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array element-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        boolean isAscending = true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
            isAscending=false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 
        
        }
    }
