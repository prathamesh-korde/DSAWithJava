//RECURSION
//callin of function in itself
//OUTER LOOP-1.stape and assume  that inner funcion do rest of work
import java.util.Scanner;
public class j_63recursion_1 {
    public static void print_num(int n){
        if(n==0){//base case
            return;
        }
        System.out.println(n);
        print_num(n-1);//recursion
    }
    public static void main(String[] args) {
        System.out.println("enter n-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        j_63recursion_1 obj = new j_63recursion_1();
        obj.print_num(n);

    }
    
}
