import java.util.Scanner;
public class jssPr {
    public static void main(String[] args) {
        char[] charArray = new char[6];
        for (int i = 0; i <= 5; i++) {
          charArray[i] = "HELLOW".charAt(i);
        }
        System.out.println("plain-text message");
        for(int i=0;i<=5;i++){
            System.out.print(charArray[i]+" ");
        }
        System.out.println();
        System.out.println("enter key-");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
       
        System.out.println("cypher text message-");
        for(int j=0;j<=5;j++){
            
                    System.out.print((char)(charArray[j]+key)+" ");
                }
            }
    
    }
