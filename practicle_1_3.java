//take input frome user and reverse that number
//to check palindrome number
import java.util.Scanner;
public class practicle_1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numner(range between 2-5 digit)-");
        int no=sc.nextInt();
             int a=no/10000;
             int b=no%10000;
            int i=b/1000;
            int num_2=b%1000;
            int j=num_2/100;
            int num_3=num_2%100;
            int k=num_3/10;
            int l=num_3%10;  
            System.out.println("reverse no-");
                 if(a==0 & i!=0){
                    System.out.print(l);
                    System.out.print(k);
                    System.out.print(j);
                    System.out.println(i);
                 }
                 else if(i==0 & j!=0){
                    System.out.print(l);
                    System.out.print(k);
                    System.out.println(j);

                 }
                 else if(j==0 & k!=0){
                    System.out.print(l);
                    System.out.println(k);

                 }
                 else {
                    System.out.print(l);
                    System.out.print(k);
                    System.out.print(j);
                    System.out.print(i);
                    System.out.println(a);
                 }
                 if(a==l && k==i){
                  System.out.println("palindrome number");
                 }
            }
    }

