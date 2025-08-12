//upadate the 2 nd bit (position=1) of number n to 1.(n=0101)
import java.util.Scanner;
public class j_59upadate_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ope=sc.nextInt();
        int num=5;
        int pos=1;
        int bitMask=1<<pos;
        if(ope==1){
            //set
            int newNumber=bitMask|num;
            System.out.println(newNumber);
        }
        else{
            //claer
            int number=~(bitMask);
            int newNumber=number & num;
            System.out.println(newNumber);

        }


    }
}
