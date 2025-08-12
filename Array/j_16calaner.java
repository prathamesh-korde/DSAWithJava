//Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on
import java.util.Scanner;

public class j_16calaner {
    
   public static void main(String[] args) {
    System.out.println("enter n-");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    switch(n){
        case 1 :System.out.println("janavery");
        break;
        case 2:System.out.println("feb");
        break;
        case 3:System.out.println("march");
        break;
        case 4:System.out.println("april");
        break;
        case 5:System.out.println("may");
        break;
        case 6:System.out.println("june");
        break;
        case 7:System.out.println("jully");
        break;
        case 8:System.out.println("aug");
        break;
        case 9:System.out.println("sep");
        break;
        case 10:System.out.println("out");
        break;
        case 11:System.out.println("nov");
        break;
        case 12:System.out.println("dec");
        break;
        default :System.out.println("enter valid no");
    }
   } 
    
}
