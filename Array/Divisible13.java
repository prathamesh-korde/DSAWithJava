//Given a number represented as a string s (which may be very large), check whether it is divisible by 13 or not.

import java.math.BigInteger;

public class Divisible13 {

    //  public boolean divby13(String s) {
    //     // code here
    //     return Integer.parseInt(s)%13 == 0;
    // }

    //  public boolean divby13(String s) {
    //     // code here
    //     BigInteger num = new BigInteger(s);
    //     return num.mod(BigInteger.valueOf(13)).equals(BigInteger.ZERO);
    // }

    public static boolean divby13(String s) {
        
         int digit = 0;
        int i=0;
        while(i<s.length()){
            digit = digit*10 + (s.charAt(i)-'0');
            digit = digit %13;
            i++;
        }
        return digit  == 0;
    }
    public static void main(String[] args) {
        String s = "2911285";
        System.out.print(divby13(s));
    }
}
