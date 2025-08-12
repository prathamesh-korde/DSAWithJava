/*Given a string s consisting of digits, determine whether it can be classified as a sum-string.

A sum-string is a string that can be split into more than two non-empty substrings such that:


The rightmost substring is equal to the sum of the two substrings immediately before it (interpreted as integers).

This condition must apply recursively to the substrings before it.

The rightmost substring (and any number in the sum) must not contain leading zeroes, unless the number is exactly '0'.

 */

import java.math.BigInteger;

public class Sumstring {
    public static  boolean isSumString(String s) {
        // code here
       int n = s.length();

        
        for (int len1 = 1; len1 <= n - 2; len1++) {
            for (int len2 = 1; len1 + len2 <= n - 1; len2++) {

               
                if ((s.charAt(0) == '0' && len1 > 1) ||
                    (s.charAt(len1) == '0' && len2 > 1)) {
                    continue;
                }

                if (isValidSplit(s, len1, len2)) {
                    return true;
                }
            }
        }
        return false;
    }

   
    private static boolean isValidSplit(String s, int len1, int len2) {

        BigInteger first  = new BigInteger(s.substring(0, len1));
        BigInteger second = new BigInteger(s.substring(len1, len1 + len2));
        int pos = len1 + len2;

        while (pos < s.length()) {
            BigInteger sum = first.add(second);
            String sumStr = sum.toString();

           
            if (!s.startsWith(sumStr, pos)) {
                return false;
            }

            
            pos   += sumStr.length();
            first  = second;
            second = sum;
        }
        return true;        
    }
    public static void main(String[] args) {
        String  s = "12243660";
        System.out.println("The string can be split is "+isSumString(s));
    }
}
