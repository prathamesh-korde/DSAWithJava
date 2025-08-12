//to check armstrong no
import java.util.Scanner;
public class practicle_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        double arm=0;
        int digit;
        int length = String.valueOf(n).length();
        while (n !=0){
            digit=n%10;
            n=n/10;
            arm=Math.pow(digit,length)+arm;

        }
        if(arm==num){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }

    }
    
}
