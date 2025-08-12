import java.util.Arrays;
/*You are given an array coins[], where each element represents a coin of a different denomination, and a target value sum. You have an unlimited supply of each coin type {coins1, coins2, ..., coinsm}.

Your task is to determine the minimum number of coins needed to obtain the target sum. If it is not possible to form the sum using the given coins, return -1.

Examples:

Input: coins[] = [25, 10, 5], sum = 30
Output: 2
Explanation: Minimum 2 coins needed, 25 and 5   */
public class MinimumCoins {
    public static int minCoins(int coins[], int sum) {
        // code here
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, sum + 1);
        int n = coins.length;
        dp[0] = 0;
        for(int num : coins) {
            for(int j = num; j <= sum; j++) {
                dp[j] = Math.min(dp[j], 1 + dp[j - num]);
            }
        }
        
        return dp[sum] == sum + 1 ? -1 : dp[sum];
    }

    public static void main(String[] args) {
        int[] coins ={9, 6, 5, 1};
        int sum = 19;
        System.out.println("minimum number of coins needed to obtain the target sum is "+minCoins(coins, sum));
    }
}
