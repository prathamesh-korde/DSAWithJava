//print the factorial of a number n
import java.util.Scanner;
public class j_65recursion_1_Q2{
    public static void facto(int i,int n,int fac){
        if(n==0){
            System.out.println(1);
            return;
        }
        if(n==i){
            fac *=i;
            System.out.println(fac);
            return;

        }
        fac*=i;
        facto(i+1,n,fac);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        facto(1,n,1);
    }

}