//print the table of n inpt by user
import java.util.Scanner;
public class j_14table {
    public static void main(String[] args) {
        System.out.println("enter n-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
