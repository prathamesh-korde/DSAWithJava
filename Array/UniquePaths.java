//Unique Paths in a Grid
/*You are given a 2d list grid[][] of size n x m consisting of values 0 and 1.
A value of 0 means that you can enter that cell and 1 implies that entry to that cell is not allowed.
You start at the upper-left corner of the grid (1, 1) and you have to reach the bottom-right corner (n, m) such that you can only move in the right or down direction from every cell.
Your task is to calculate the total number of ways of reaching the target.

Note: The first (1, 1) and last (n, m) cell of the grid can also be 1.
It is guaranteed that the total number of ways will fit within a 32-bit integer. */

public class UniquePaths {
    public static int uniquePaths(int[][] grid) {
         int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1)
        {
            return 0;
        }
        int dp[][]=new int[n][m];
        dp[0][0]=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else
                {
                    if(i>0)
                    {
                        dp[i][j]+=dp[i-1][j];
                    }
                    if(j>0)
                    {
                        dp[i][j]+=dp[i][j-1];
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println("calculate the total number of ways of reaching the target "+uniquePaths(arr));
    }
}
