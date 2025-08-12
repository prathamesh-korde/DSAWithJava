public class J_191PartitionEqualSubsetSum
{
    public static boolean sol(int arr[], int sum, int i, Boolean[][] dp) {
        if (sum == 0) {
            return true;
        }
        if (i == arr.length || sum < 0) {
            return false;
        }
        if (dp[i][sum] != null) return dp[i][sum];

        boolean take = false;
        if (sum >= arr[i]) {
            take = sol(arr, sum - arr[i], i + 1, dp);
        }
        boolean notTake = sol(arr, sum, i + 1, dp);

        return dp[i][sum] = take || notTake;
    }

    public static Boolean isSubsetSum(int arr[], int sum) {
        Boolean[][] dp = new Boolean[arr.length][sum + 1];  // Use Boolean for null checks
        return sol(arr, sum, 0, dp);
    }
    public static boolean equalPartition(int arr[]) {
        int sum = 0;
        for(int i : arr){
            sum=i+sum;
        }
        if(sum%2!=0)
            return false;
        return isSubsetSum(arr,sum/2);
        
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum =9;
        System.out.println("there exist a subset with target sum "+ sum +" "+equalPartition(arr));
    }

}