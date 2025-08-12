//print the fibonacci sequence till nth term
import java.util.Scanner;
public class j_66recursion_1_Q3 {
    public static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }
    public static void main(String[] args) {
        int first=0;
        int secound=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n-");
        int n=sc.nextInt();
        System.out.println(first);
        System.out.println(secound);
        fibo(first,secound,n-2);
    }
}
