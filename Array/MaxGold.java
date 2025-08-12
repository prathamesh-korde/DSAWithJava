/*Given a gold mine called mat[][]. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially, the miner can start from any row in the first column. From a given cell, the miner can move -

to the cell diagonally up towards the right
to the right
to the cell diagonally down towards the right
Find out the maximum amount of gold that he can collect until he can no longer move. */

import java.util.Arrays;

public class MaxGold {
//simple Recurrision
// public int solve(int i, int j, int[][] mat) {
//         int n = mat.length;
//         int m = mat[0].length;
        
        
//         if (i < 0 || i >= n || j < 0 || j >= m) {
//             return 0;
//         }

//         int rightUp = solve(i - 1, j + 1, mat);
//         int right = solve(i, j + 1, mat);  
//         int rightDown = solve(i + 1, j + 1, mat);

//         return mat[i][j] + Math.max(rightUp, Math.max(right, rightDown));
//     }

//     public int maxGold(int[][] mat) {
//         int result = 0;
//         int n = mat.length;
//         int m = mat[0].length;

//         for (int i = 0; i < n; i++) {
//             result = Math.max(result, solve(i, 0, mat));
//         }
//         return result;
//     }


    //Using Dp
    int[][] dp;
    public  int solve(int i, int j, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return 0;
        }
        if (dp[i][j] != -1) 
        return dp[i][j];

        int rightUp = solve(i - 1, j + 1, mat);
        int right = solve(i, j + 1, mat);  
        int rightDown = solve(i + 1, j + 1, mat);

         return dp[i][j] = mat[i][j] + Math.max(rightUp, Math.max(right, rightDown));
    }

    public int maxGold(int[][] mat) {
        int result = 0;
        int n = mat.length;
        int m = mat[0].length;
         dp = new int[n][m];
         for (int[] row : dp) {
             Arrays.fill(row, -1);
         }
        for (int i = 0; i < n; i++) {
            result = Math.max(result, solve(i, 0, mat));
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] mat =  {{1, 3, 3}, 
                        {2, 1, 4},
                        {0, 6, 4}};

        MaxGold gold = new MaxGold();
         System.out.println("maximum amount of gold that he can collect is - "+gold.maxGold(mat));           
    
    }
}
