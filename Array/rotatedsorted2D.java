public class rotatedsorted2D {
 
    
    // static boolean searchMatrix(int[][] mat, int x){
    //     int n = mat.length;         
    //     int m = mat[0].length;      

    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
                
               
    //             if (mat[i][j] == x) {
    //                 return true;
    //             }
    //         }
    //     }

        
    //     return false;
    // }

    public static  boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int left = 0, right = n * m - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            int row = mid / m;
            int col = mid % m;
            
            int midVal = mat[row][col];
            
            if (midVal == x) {
                return true;
            }
            
            int leftRow = left / m, leftCol = left % m;
            int rightRow = right / m, rightCol = right % m;
            
            int leftVal = mat[leftRow][leftCol];
            int rightVal = mat[rightRow][rightCol];
            
            if (leftVal <= midVal) { 
                if (leftVal <= x && x < midVal) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { 
                if (midVal < x && x <= rightVal) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return false;
    }


    public static void main(String[] args) {
        int[][] mat = {
            {7, 8, 9, 10},
            {11, 12, 13, 1},
            {2, 3, 4, 5}
        };
        int x = 3;

        if (searchMatrix(mat, x)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

