//Print all even numbers till n.
import java.util.Scanner;
public class j_16even {
    public static void main(String[] args) {
        System.out.println("enter value of n-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enen no-");
        for (int i = 0; i < n; i++) {
            if(i%2==0)
                System.out.println(i);
        }
    }
    
}
