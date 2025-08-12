//print the sum of first n natural no

import java.util.Scanner;
public class j_13sum {
    public static void main(String args[])
    {
        System.out.println("enter n-");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
