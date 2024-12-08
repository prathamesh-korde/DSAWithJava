import java.util.*;
public class j_52strings {
    public static void main(String[] args) {
        //String are immutable
        Scanner sc=new Scanner(System.in);
        String name1="prathamesh";
        String name2="korde";
        String fullName=name1+name2;
        System.out.println("my full name is-"+fullName);
        System.out.println(fullName.length());
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        //compareTo
        //string1>string2:+ve value
        //String1==String2:0 
        //String1<String2:-ve value
        //hell0<wello
        if(name1.compareTo(name2)==0){
            System.out.println("string are equal");
        }
        else{
            System.out.println("string are not equal");
        }
        //substring(startinng index,ending index);
        String name=fullName.substring(10,fullName.length());
        System.out.println(name);
        //parseInt()
        String str="123";
        int num=Integer.parseInt(str);
        System.out.println(num);
        //toString
        int number=123;
        String st=Integer.toString(number);
        System.out.println(st.length());


    }
}
