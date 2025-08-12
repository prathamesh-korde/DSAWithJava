import java.util.*;
public class J_182Solution{
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // Characters match, extend LCS
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Take max from previous states
                }
            }
        }

        return dp[n][m]; // The bottom-right cell contains the LCS length
    }

    public static void main(String args[]) {
        String S1 = "ABCDGH";
        String S2 = "AEDFHR";
        System.out.println("Longest Common Subsequence Length: " + lcs(S1, S2));
    }
}
