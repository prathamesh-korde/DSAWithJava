//Find rectangle with corners as 1
/*Given an n x m binary matrix mat[][] containing only 0s and 1s, determine if there exists a rectangle within the matrix such that all four corners of the rectangle are 1. If such a rectangle exists, return true; otherwise, return false. */

import java.util.HashMap;
import java.util.HashSet;

public class Findrectangle {

    // Brute-force approach
    public boolean ValidCornerB(int mat[][]) {
        int m = mat.length;
        int n =mat[0].length;
        for(int r1=0 ; r1<m ;r1++){
            for(int r2=r1+1 ; r2<m ; r2++){
                for(int c1=0 ; c1<n ;c1++){
                    for(int c2 = c1+1 ; c2<n ; c2++ ){
                        if(mat[r1][c1] == 1 && mat[r1][c1]==1 && mat[r2][c1]==1 && mat[r2][c2]==1 ){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    // Optimized approach using column-wise row set intersection

     public boolean ValidCorner(int mat[][]) {
        HashMap<Integer,HashSet<Integer>> colwise = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<m;i++)
        {
            colwise.put(i,new HashSet<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1) colwise.get(j).add(i);
            }
        }
        
        for(int i=0;i<m-1;i++)
        {    
            for(int j=i+1;j<m;j++)
            {    int count =0;
                for(Integer el :colwise.get(i))
                {
                    if(colwise.get(j).contains(el)) count++;
                    if(count==2) return true;
                }
            }
        }
            
        
        return false;
        
    }

    public static void main(String[] args) {
        Findrectangle fr = new Findrectangle();

        int[][] mat = {
            {1, 0, 0, 1},
            {0, 0, 1, 0},
            {1, 0, 0, 1}
        };

        System.out.println("Brute-force method result: rectangle exists " + fr.ValidCornerB(mat));  
        System.out.println("Optimized method result:  rectangle exists " + fr.ValidCorner(mat));     
    }
}
