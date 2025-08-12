/*
 Given a string s, write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome, while maintaining the order of characters.
 */
public class MinimumDeletions {
    //using Recursion
    /*
     * public static int sol(int i , int j , String str){
        if(i>=j){
            return 0;
        }
        
        if(str.charAt(i)==str.charAt(j)){
            return sol(i+1,j-1,str);
        }
        
        return 1 + Math.min(sol(i+1,j,str),sol(i,j-1,str));
    }
    static int minDeletions(String s) {
       int n = s.length();
       return sol(0,n-1,s);
    }
     */


    //Usind DP
    static int[][] dp = new int[1001][1001];
    public static int sol(int i , int j , String str){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(str.charAt(i)==str.charAt(j)){
            return dp[i][j] = sol(i+1,j-1,str);
        }
        
        return dp[i][j] = 1 + Math.min(sol(i+1,j,str),sol(i,j-1,str));
    }
     public static int minDeletions(String s) {
       for (int i = 0; i < 1001; i++) {
        for (int j = 0; j < 1001; j++) {
            dp[i][j] = -1;
        }
    }
       int n = s.length();
       return sol(0,n-1,s);
    }
    public static void main(String[] args) {
        String str = "aebcbda";
        System.out.println("Minimum Deletions character for make string palindrome is "+minDeletions(str));
    }
}
