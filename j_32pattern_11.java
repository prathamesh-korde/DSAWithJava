//solid rhombus
import java.util.Scanner;
public class j_32pattern_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
        for(int k=0;k<n;k++){
            System.out.print("* ");
        }
        System.out.println();

        }
        
        
    }
    
}
