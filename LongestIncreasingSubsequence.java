import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class LongestIncreasingSubsequence {
    static int lis(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Every element is a sequence of length 1

        int maxLength = 1;

        for (int i = 1; i < n; i++) { // Loop through array
            for (int j = 0; j < i; j++) { // Check all previous elements
                if (arr[i] > arr[j]) { // If arr[j] < arr[i], extend the sequence
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]); // Keep track of the max LIS found
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {47, 42, 34, 35, 33, 25, 4, 36};
        System.out.println("Longest Increasing Subsequence Length: " + lis(arr));
    }
}

