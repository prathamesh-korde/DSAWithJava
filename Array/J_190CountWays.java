
import java.lang.reflect.Array;
import java.util.Arrays;

//Coin Change (Count Ways)
/*Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ]. 
Note: Assume that you have an infinite supply of each type of coin. Therefore, you can use any coin as many times as you want.
Answers are guaranteed to fit into a 32-bit integer.  */

public class J_190CountWays {
    public static int sol(int coins[], int sum,int i,int dp[][]){
        if(sum<0 || i==coins.length ){
            return 0;
        }if(sum==0){
            return 1;
        }
        if (dp[i][sum] != -1) return dp[i][sum]; 
        
        int peek = sol(coins,sum-coins[i],i,dp);
        int notpeek = sol(coins,sum,i+1,dp);
        return dp[i][sum] = peek+notpeek;
    }
    public static int count(int coins[], int sum) {
        int[][] dp = new int[coins.length+1][sum+1];
         for (int[] row : dp) Arrays.fill(row, -1);
        return sol(coins,sum,0,dp);
    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println("the number of ways you can make sum by using different combinations from coins is "+count(coins, sum));
    }

}
