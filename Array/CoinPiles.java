/*You are given an array arr[] of integers, where each element represents the number of coins in a pile. You are also given an integer k.
Your task is to remove the minimum number of coins such that the absolute difference between the number of coins in any two updated piles is at most k.

Note: You can also remove a pile by removing all the coins of that pile. */

import java.util.Arrays;

public class CoinPiles {

    public int minimumCoins(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] subset = new int[n];
        subset[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            subset[i] = arr[i] + subset[i + 1];
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int ind = findUpper(arr, arr[i] + k, i, n - 1);

            if (ind == -1) {
                min = Math.min(min, sum);
                sum += arr[i];
                continue;
            }

            int curr = subset[ind] - ((n - ind) * (arr[i] + k));
            curr += sum;

            min = Math.min(min, curr);
            sum += arr[i];
        }

        return min;
    }

    static int findUpper(int[] arr, int target, int s, int e) {
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        CoinPiles cp = new CoinPiles();
        int[] piles = {1, 5, 1, 2, 5, 1};
        int k = 2;
        System.out.println(cp.minimumCoins(piles, k));
    }
}
