//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.*;
public class j_43q3 {
    public static void gcf(int num1,int num2,int n){
        int gcf=1;
        for(int i=1;i<=n;i++){
            if(num1 %i==0 && num2 %i==0){
                gcf=i;
            }
        }
        System.out.println("gratest common factor is-"+gcf);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int n;
        if(num1>num2)
            n=num1;
        else
            n=num2;
        gcf(num1,num2,n);     
    }
    
}
