//hollow butterfly
import java.util.Scanner;
public class j_35pattern_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1||i==2){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }     
       }
          else{
           System.out.print("*");
           for(int j=2;j<=i;j++){
            System.out.print(" ");
           }
           System.out.print("*");
        }
        for(int j=2*(n-i);j>=1;j--){
            System.out.print(" ");
        }
        if(i==1||i==2)
        System.out.print(" *");
        else{
        System.out.print("*");
        for(int j=2;j<=i;j++){
        System.out.print(" ");
        }
    }
       if(i>=2){
        System.out.print("*");
       }
        
        System.out.println();
            
        }
    }
    
}
