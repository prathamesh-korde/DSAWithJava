//O(n)
import java.util.Arrays;
public class J_183LongPalindrom {
   private static int[][] dp;
    public static int sol(int i, int j,String s1,String s2){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+sol(i+1,j+1,s1,s2);
        } 
        return dp[i][j]=Math.max(sol(i+1,j,s1,s2),sol(i,j+1,s1,s2));
    }
    public static int longestPalinSubseq(String s) {
         String s2 = new StringBuilder(s).reverse().toString();
         int m= s.length();
         int n = s2.length();
         dp= new int[m][n];
         for(int[] row:dp) Arrays.fill(row,-1);
     return sol(0,0,s,s2);
    } 
    public static void main(String[] args) {
        String s1 = "bbabcbcab";
        System.out.println("Longest Palindromic Subsequence is "+longestPalinSubseq(s1));
    }
}
