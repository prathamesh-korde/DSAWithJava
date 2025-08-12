//FU NCTION-
//block of code whis perform specific task 
//syntax-public Static returntype function_name(type arg1,type arg2){
//}
//function and method working is sane.
//ounly difference it we call function directilly and for method we heav to call by object
import java.util.*;
public class j_38function_1 {
    public static void myName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        myName(name);
    }
}