//Kth element in Matrix

/*
  Given a matrix mat[][] of size n*n, where each row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.
 */

import java.util.ArrayList;

public class Kthelement {
    public static int kthSmallest(int[][] matrix, int k) {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                arr.add(matrix[i][j]);
            }
        }
        
        arr.sort(null);
        
        return arr.get(k-1);
    }
    public static void main(String[] args) {
        int[][] mat = {{16, 28, 60, 64}, {22, 41, 63, 91}, {27, 50, 87, 93} , {36, 78, 87, 94}};
        int k = 5;
        System.out.println(k+"th smallest Element in Array is - "+kthSmallest(mat, k));
      }
}
