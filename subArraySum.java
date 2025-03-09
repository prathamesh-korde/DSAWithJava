public class subArraySum {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("\bruteForceSubarray Sum Approach:");
        bruteForceSubarraySum(arr);
    }

    static void bruteForceSubarraySum(int[] arr) {
       int n= arr.length;
       for(int i = 0; i <n ;i++){
        for(int j = i ; j< n ; j++){
            int sum = 0;
            for(int k = i ; k <=j ; k++){
                sum +=arr[k];
            }
            System.out.print(sum+" ");
        }
       }

    }

    static void prefixSumSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum;
                if (i == 0) {
                    sum = prefixSum[j];
                } else {
                    sum = prefixSum[j] - prefixSum[i - 1];
                }
                System.out.println("Subarray [" + i + ", " + j + "] Sum: " + sum);
            }
        }
    }
}
