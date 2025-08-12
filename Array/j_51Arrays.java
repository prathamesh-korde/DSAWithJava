//print the transpose of matrix as output for given matrix of number
import java.util.*;


public class j_51Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }
      System.out.println("orignal matrix-");
      //orignam matrix
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
      }


      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
   }
}
