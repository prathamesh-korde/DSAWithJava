//Make a program that takes the radius of a circle as input, 
//calculates its radius and area and prints it as output to the user.
import java.util.Scanner;
public class j_15circleArea {
    public static void main(String[] args) {
        System.out.println("enter radius of circle-");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("area of circle-"+3.14*r*r);
    }
}
