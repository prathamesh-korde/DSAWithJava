//defining an array-
//type[] arratName=new type[size];
//or
//type[] arrayName={1,2,3,5,6}

import java.util.Scanner;
public class j_44array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    
}
