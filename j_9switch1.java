//switch case
import java.util.Scanner;
public class j_9switch1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:System.out.println("hellow");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjor");
            break;
            default:System.out.println("invalid button");
        }

    }
}