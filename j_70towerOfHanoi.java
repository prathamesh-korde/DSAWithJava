//TOWER OF HANOI
//TIME COMPLIXITY-O(2^n - 1)~O(2^n)

import java.util.Scanner;
public class j_70towerOfHanoi {
    public static void tower(int n,String src,String helper,String destination){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+destination);
            return;
        }
        tower(n-1,src,destination,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+destination);
        tower(n-1,helper,src,destination);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of disk-");
        int n=sc.nextInt();
        tower(n,"S","H","D");

    }
}
