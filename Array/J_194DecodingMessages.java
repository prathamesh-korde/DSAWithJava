import java.util.Arrays;

public class J_194DecodingMessages {
     public static int sol(String digits, int n, int i,int[] dp) {
        if (i == n) {
            return 1;
        }
        if (digits.charAt(i) == '0') { // If '0' appears alone, it is invalid
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one = sol(digits, n, i + 1,dp);
        int two = 0;

        if (i < n - 1 && (digits.charAt(i) == '1' || 
            (digits.charAt(i) == '2' && digits.charAt(i + 1) <= '6'))) {
            two = sol(digits, n, i + 2,dp);
        }
        return dp[i] = one + two;
    }
    public static int countWays(String digits) {
        int n = digits.length();
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return sol(digits,n,0,dp);
    }
    public static void main(String[] args) {
        String digits = "123";
        System.out.println("total number of ways that message can be decode "+countWays(digits));
    }
}
