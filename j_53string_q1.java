//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
import java.util.Scanner;
public class j_53string_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result=result+'i';
            }
            else{
                result=result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
    
}
