//O(n^2)

public class LongPalindrom {
    public static boolean checkPal(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static int subStr(String str, String newStr, int idx, int maxlen) {
        if (idx == str.length()) {
            return checkPal(newStr) ? Math.max(maxlen, newStr.length()) : maxlen;
        }
        int include = subStr(str, newStr + str.charAt(idx), idx + 1, maxlen);
        int exclude = subStr(str, newStr, idx + 1, maxlen);
        return Math.max(include, exclude);
    }
    public static int longestPalinSubseq(String s) {
        int res= subStr(s, "", 0, 0);
        return res;
    }
    public static void main(String[] args) {
        String s1 = "bbabcbcab";
        System.out.println("Longest Palindromic Subsequence is "+longestPalinSubseq(s1));
    }
}
