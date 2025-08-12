
import java.util.Scanner;

//make a function to add 2 numbers and return the sum
public class j_39function_2 {
    public static int sum(int num1,int num2){
        int add=num1+num2;
        return add;
        
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int add=sum(num1,num2);
        System.out.println("addition of two number-"+add);
        System.out.print("multiplacation of two no-"+mul(num1,num2));


    }
    
}
