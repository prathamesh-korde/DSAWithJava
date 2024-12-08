//half pyramid
import java.util.Scanner;
public class j_20patten3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n-");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
