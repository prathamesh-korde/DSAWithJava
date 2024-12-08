//invrted half pyramid(roteated by 180 degree)
import java.util.Scanner;
public class j_22patten5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
       for(int i=1;i<=n;i++){
        //inner loop for printing space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //inner loop for star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }

    }
}
