/*
 * Given n dice each with m faces. Find the number of ways to get sum x which is the summation of values on each face when all the dice are thrown.
 */

public class Dicethrow {
    static int dp[][] = new int[51][51];

public static int sol(int m, int n, int x, int dp[][]) {
    if (x < 0) {
        return 0;
    }
    if (x == 0 && n == 0) {
        return 1;
    }
    if (n == 0) {
        return 0;
    }

    if (dp[n][x] != -1) {
        return dp[n][x];
    }

    int result = 0;
    for (int faceval = 1; faceval <= m; faceval++) {
        result += sol(m, n - 1, x - faceval, dp);
    }
    return dp[n][x] = result;
}

 static int noOfWays(int m, int n, int x) {
    for (int i = 0; i < 51; i++) {
        for (int j = 0; j < 51; j++) {
            dp[i][j] = -1;
        }
    }
    return sol(m, n, x, dp);
}
public static void main(String[] args) {
    int n = 3 , m = 6 , x = 12;
    System.out.println("number of ways to get sum x is " + noOfWays(m, n, x));
}
}
