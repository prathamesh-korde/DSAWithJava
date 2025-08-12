import java.util.*;

public class PascalTriangle {
    public static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int value = 1; 
        list.add(value);
        for(int i=1;i<n;i++){
            value = (value*(n-i))/i;
            list.add(value);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth Row");
        int n = sc.nextInt();
        System.out.println("nth Row Of Pascal Triangle "+nthRowOfPascalTriangle(n));
    }
}
