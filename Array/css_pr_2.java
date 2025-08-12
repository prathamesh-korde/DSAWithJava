//implation of Affine Cipher
import java.util.*;
public class css_pr_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter plain-text-");
        String pt=sc.nextLine();
        System.out.println("enter key-");
        System.out.print("X-");
        int keyX=sc.nextInt();
        System.out.print("Y-");
        int keyY=sc.nextInt();
        char[] arr=new char[26];
        int[] arry=new int[pt.length()];
        for(int i=0;i<=25;i++){
            arr[i]=(char)('a'+i);
        }
        System.out.println("cypher text-");
        for(int i=0;i<pt.length();i++){
            for(int j=0;j<=25;j++){
                if(pt.charAt(i)==arr[j]){ 
                     System.out.print(arr[((j*keyX)+keyY)%26]+" ");      
            }
        }    
        }
    }}
