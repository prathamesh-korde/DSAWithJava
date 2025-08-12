/*You are given an array arr[] which represents houses arranged in a circle, where each house has a certain value. A thief aims to maximize the total stolen value without robbing two adjacent houses.
Determine the maximum amount the thief can steal.

Note: Since the houses are in a circle, the first and last houses are also considered adjacent. */

import java.util.*;

public class J_193SticklerThief {
    public static int sol( int arr[] , int i ,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int peek = arr[i]+sol(arr,i+2,dp);
        int notPeek = sol(arr,i+1,dp);
        return  dp[i] = Math.max(peek,notPeek);
    }
    public static int maxValue(int[] arr) {
        int n = arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        
        int max1 = sol(Arrays.copyOfRange(arr, 0, n-1), 0, dp1);
        int max2 = sol(Arrays.copyOfRange(arr, 1, n), 0, dp2);
        return Math.max(max1, max2);
    }
    public static void main(String[] args) {
        int[] arr ={2, 2, 3, 1, 2};
        System.out.println("the maximum amount the thief can steal "+maxValue(arr));

    }
}
