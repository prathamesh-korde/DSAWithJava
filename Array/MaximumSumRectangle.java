public class MaximumSumRectangle {
    public static int maxRectSum(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int[] temp = new int[m];

            for (int j = i; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    temp[k] += mat[j][k];
                }

                int currentMax = kadane(temp);  
                maxSum = Math.max(maxSum, currentMax);
            }
        }

        return maxSum;
    }
    private static int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, -1, -4, -20 },
                        { -8, -3, 4, 2, 1 },
                        { 3, 8, 10, 1, 3 },
                        { -4, -1, 1, 7, -6 } };

        int res = maxRectSum(mat);
        System.out.println(res); 
    }
}
