public class CircularSubarraySum {
    //Brute Force Approach – O(n²)
    // public static  int maxCircularSum(int arr[]) {
    //    int n = arr.length;
    //     int maxSum = Integer.MIN_VALUE;

    //     for (int i = 0; i < n; i++) {
    //         int currSum = 0;
    //         for (int j = 0; j < n; j++) {
    //             currSum += arr[(i + j) % n];
    //             maxSum = Math.max(maxSum, currSum);
    //         }
    //     }
    //     return maxSum;
    // }

    // Optimized Circular Subarray Sum – O(n)

    public static int maxCircularSum(int arr[]) {
          int total = 0;
        int maxSum = Integer.MIN_VALUE;
        int curMax = 0;
        int minSum = Integer.MAX_VALUE;
        int curMin = 0;

        for (int num : arr) {
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);

            total += num;
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }

     public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println("maximum non-empty subarray sum, considering both non-wrapping and wrapping cases is "+maxCircularSum(arr)); // Output: 22
    }
}
