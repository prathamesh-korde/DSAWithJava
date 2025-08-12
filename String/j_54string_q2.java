//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
import java.util.Scanner;
public class j_54string_q2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter email id-");
        String email=sc.nextLine();
        String userName=" ";
        System.out.println("email-id-"+email);
        for(int i=0;i<=email.length();i++){
            if(email.charAt(i)=='@'){
             break;
            }
            else{
                userName=userName+email.charAt(i);
            }
        }
        System.out.println("user name-"+userName);
    }
    
}
