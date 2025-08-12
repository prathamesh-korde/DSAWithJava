public class J_185PalindromeSubStrings {
    public static  int countPS(String s) {
        int n = s.length();
        int count = 0;
        int l, r;
        
        // Traverse each character and consider it as the middle of the palindrome
        for (int i = 0; i < n; i++) {
            // Count even length palindromic substrings
            l = i - 1;
            r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                count++;
                l--;
                r++;
            }
            
            // Count odd length palindromic substrings
            l = i - 1;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                count++;
                l--;
                r++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str ="abaab";
        System.out.println("count all palindromic sub-strings present in the string  greater than or equal to two is "+countPS(str));
    }
}