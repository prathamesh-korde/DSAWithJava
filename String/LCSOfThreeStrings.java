public class LCSOfThreeStrings {
    public int lcsOf3(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int o = s3.length();

        int[][][] dp = new int[m + 1][n + 1][o + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= o; k++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1) && s1.charAt(i - 1) == s3.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(
                            dp[i - 1][j][k],
                            Math.max(dp[i][j - 1][k], dp[i][j][k - 1])
                        );
                    }
                }
            }
            }

        return dp[m][n][o];
    }
}
