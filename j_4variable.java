
import java.util.Scanner;



public class j_4variable {
    public static void main(String[] args) {
        //variables
        //String name="tony stark";
        int age=19;
        double prise=25.5;
        int a=25;
        int b=53;
        //datatype
        /*PRIMITIVE-
        bytes-1bytes
        char-2 bytes
        boolen-1byte
        int-4byte
        long-8 bytes
        float-4byte
        double-8byte

        non-primitive-
        *string
        *array
        *class
        *object
        *interface                    
         */
         int sum=a+b;
         System.out.println(sum);
         /*PRIVORITY-
          (*),(/),(%),(+),(-);
          */
          //take an input from user
         Scanner sc = new Scanner(System.in);
         String name= sc.nextLine();
         //nextInt()
         //nextFloat()
         System.out.println(name);
    }
    
}
