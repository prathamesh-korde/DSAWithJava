/*Given an integer n. Return the nth row of the following look-and-say pattern.
1
11
21
1211
111221
Look-and-Say Pattern:

To generate a member of the sequence from the previous member, read off the digits of the previous member, counting the number of digits in groups of the same digit. For example:

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
1211 is read off as "one 1, one 2, then two 1s" or 111221.
111221 is read off as "three 1s, two 2s, then one 1" or 312211. */

import  java.util.*;
public class SayPattern {
    public static String getNext(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char prev = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prev) {
                count++;
            } else {
                result.append(count).append(prev);
                count = 1;
                prev = str.charAt(i);
            }
        }
        result.append(count).append(prev); // for last group
        return result.toString();
    }
    public static String countAndSay(int n) {
       if (n <= 0) return "";

        String res = "1";
        for (int i = 1; i < n; i++) {
            res = getNext(res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("enter value of n-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The " + n + "th row of the Look-and-Say pattern is: " + countAndSay(n));
    }
}
