//print factorial  
import java.util.*;
public class j_40functiom_3 {
    public static void calFac(int n){
        if(n<0){
            System.out.println("envalid number");
            return ;
        }
        int facto=1;
        for(int i=1;i<=n;i++){
            facto=facto*i;
        }
        System.out.println("factorial of number is-"+facto);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calFac(n);
        
       
    }
    
}
