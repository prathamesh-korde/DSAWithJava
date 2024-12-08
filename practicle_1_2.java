//check the prime number11
import java.util.Scanner;
public class practicle_1_2 {
     public static void main(String[] args) {
        System.out.println("enter n-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println("prime no");
        }
        else{
            System.out.println("non-prime no");
        }    
    }
}
