public class J_1890KnapsackProblem {
   public static int knapsack(int W, int val[], int wt[]) {
        int dp[]=new int[W+1];
        for(int i=0;i<val.length;i++)
            for(int w=W;w>=wt[i];w--)
                dp[w]=Math.max(dp[w],val[i]+dp[w-wt[i]]);
        return dp[W];
        
    }
    public static void main(String[] args) {
       int W = 4;
       int val[] = {1, 2, 3}; 
       int wt[] = {4, 5, 1} ;
       System.out.println("knapsack  val "+knapsack(W, val, wt));
    }
}
