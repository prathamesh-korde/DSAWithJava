//Replace each alphabet with its equivalent 7-bit ASCII code.
import java.util.Scanner;
public class pr1{
    public static void main(String[] args) {
        System.out.println("enter the bit-");
        Scanner sc=new Scanner(System.in);
        int bit=sc.nextInt();
        for(char ch='a';ch<='d';ch++){
            int ascii_1=(int)ch;
            System.out.print(ch+"=");
            System.out.println(ascii_1+bit);
        }

    }

}