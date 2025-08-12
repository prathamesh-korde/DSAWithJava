//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java .util.Scanner;
public class j_42q2 {
    public static int power(int n,int x){  
        int pow=1;
        for(int i=0;i<x;i++){
            pow = pow*n;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
       System.out.println("power of x^n-"+power(n,x));
    }
    
}
