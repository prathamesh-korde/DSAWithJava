
import java.util.Scanner;

//There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Your task is to count the number of ways, the person can reach the top (order does matter).

public class J_187possibleStais {
    public static int countWays(int n) {
        int a = 1,b = 1;
        for(int i=2;i<=n;i++){
            int t = a+b;
            a = b;
            b = t;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("enter the number of stairs-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ways to reach "+n+"th stair is => "+countWays(n));

    }
}
