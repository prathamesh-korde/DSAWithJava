//Print if a number is prime or not (Input n from the user).
import java.util.Scanner;
public class j_17prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        System.out.println(count);
        if(count==2){
            System.out.println("prime no");
        }
        else{
            System.out.println("non-prime no");
        }
        
    }
}
