public class J_195ChainMultiplication {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int len = 2; len < n; len++){
            for(int  i =1; i < n-len+1; i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i; k < j; k++){
                    int cost = dp[i][k]+dp[k+1][j] + arr[i-1]*arr[j]*arr[k];
                    dp[i][j] = Math.min(dp[i][j],cost);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4};
        System.out.println("The efficient way is the one that involves the least number of multiplications " + matrixMultiplication(arr));
    }
}
