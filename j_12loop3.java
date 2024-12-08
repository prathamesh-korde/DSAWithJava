//do while loop
import java.util.Scanner;
public class j_12loop3 {
    public static void main(String arg[]){
        System.out.println("enter value of i-");
        Scanner ab= new Scanner(System.in);
        int i=ab.nextInt();
        do { 
            System.out.println(i);
            i++;
            
        } while(i<11);
    }
}
