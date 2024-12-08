//butterfly pattern
import java.util.Scanner;
public class j_29pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=(2*n)-(2*i);j>=1;j--){
                System.out.print("  ");
            }
           for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
         //mirror img
         for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){
                System.out.print("    ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            
            System.out.println();
         }

            
        
           
            

    }
    
}
