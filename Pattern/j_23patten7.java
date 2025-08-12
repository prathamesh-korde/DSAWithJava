//inverted half pyramid with number
import java.util.Scanner;
public class j_23patten7 {
    public static void main(String[] args) {
        System.out.println("enter n-");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(); 
       for(int i=0;i<n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(j);
        }System.out.println();

       }

    }
}
