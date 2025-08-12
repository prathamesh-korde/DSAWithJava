//print a fibonacci series using recursion in java
import java.util.Scanner;
public class practicle_1_1 {
    public static void main(String[] args) {
        System.out.println("enter n-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num;
        num = new int[100];
        num[0]=0;
        num[1]=1;
        //System.out.println(num[1]);
       for(int i=0;i<n+1;i++){
        num[i+2]=num[i]+num[i+1];
       }
       System.out.println("fibonacci series-");
       for(int i=0;i<n+1;i++){
        System.out.print(num[i]+" ");
       }
    }
}
