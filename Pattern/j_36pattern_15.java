//hollow rhombus
import java.util.Scanner;
public class j_36pattern_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=n-2;j++){
            if(i==1 ||i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.print("*");
            System.out.println();
        }
    }
    
}
