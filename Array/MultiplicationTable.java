import java.util.Arrays;

public class MultiplicationTable {

    // Time complexity > O(m * log(m * n))
    public static int kthSmallest(int m, int n, int k) {
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (i + 1) * (j + 1);
            }
        }

       
        int[] sortArr = new int[m * n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sortArr[x] = mat[i][j];
                x++;
            }
        }

       
        Arrays.sort(sortArr);

        return sortArr[k - 1];
    }
    //Time: O(m * log(m * n))

    //Space: O(1) 

     public static int kthsmallest(int m, int n, int k) {
         int left = 1, right = m * n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int count = 0;
            for (int i = 1; i <= m; i++) {
                count += Math.min(mid / i, n);
            }

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int n =2 , m =3 ,k = 5;
        System.out.println("return the kth smallest element in the m * n multiplication table is "+kthsmallest(m, n, k));
    }
}



