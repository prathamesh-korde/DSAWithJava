//to find factroial of no
import java.util.Scanner;

public class practicle_4_4{
  public static void main(String[] args) {
    System.out.println("enter thhe no-");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int facto=1;
    for(int i=1;i<=n;i++){
      facto=facto*i;
    }
    System.out.println("factroial of no" +n+" is-"+facto);
  }
      }


    