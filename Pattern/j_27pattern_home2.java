//print a number pyramid

import java.util.Scanner;

public class j_27pattern_home2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
