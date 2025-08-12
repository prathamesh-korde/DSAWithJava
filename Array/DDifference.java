public class DDifference {
    public static int[][] applyDiff2D(int[][] arr, int[][] opr) {
        int n = arr.length;
        int m = arr[0].length;

        // diff matrix of size n x m
        int[][] diff = new int[n][m];

        // apply all operations using 4-point updates
        for (int[] q : opr) {
            int v = q[0];
            int r1 = q[1], c1 = q[2], r2 = q[3], c2 = q[4];

            // top-left -> add
            diff[r1][c1] += v;
           
            // top-right -> subtract
            if (c2 + 1 < m) diff[r1][c2 + 1] -= v;
           
            // bottom-left -> subtract
            if (r2 + 1 < n) diff[r2 + 1][c1] -= v;
           
            // bottom-right -> add
            if (r2 + 1 < n && c2 + 1 < m) diff[r2 + 1][c2 + 1] += v;
        }

        // row-wise prefix sum
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                diff[i][j] += diff[i][j - 1];
            }
        }

        // column-wise prefix sum
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                diff[i][j] += diff[i - 1][j];
            }
        }

        // apply diff to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] += diff[i][j];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {1, 1, 0},
            {4, -2, 2}
        };

        int[][] opr = {
            {2, 0, 0, 1, 1},
            {-1, 1, 0, 2, 2}
        };

        int[][] res = applyDiff2D(arr, opr);

        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
