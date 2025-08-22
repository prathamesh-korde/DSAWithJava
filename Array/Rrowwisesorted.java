

public class Rrowwisesorted {
   

    // static int median(int mat[][]) {
    //     // flatten the matrix into a 1D array
    //     List<Integer> list = new ArrayList<>();
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat[0].length; j++) {
    //             list.add(mat[i][j]);
    //         }
    //     }

    //     // sort the list
    //     Collections.sort(list);

    //     // find and return the median element
    //     int mid = list.size() / 2;
    //     return list.get(mid);
    // }
  
    static int median(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        // initializing the minimum and maximum values
        int min = Integer.MAX_VALUE, 
            max = Integer.MIN_VALUE;

        // iterating through each row of the matrix
        for (int i = 0; i < n; i++) {
          
            // updating the minimum value if current 
            // element is smaller
            if (mat[i][0] < min) 
              	min = mat[i][0];

            // updating the maximum value if current 
            // element is larger
            if (mat[i][m - 1] > max) 
              	max = mat[i][m - 1];
        }

        // calculating the desired position of the median
        int desired = (n * m + 1) / 2;

        // using binary search to find the median value
        while (min < max) {
          
            // calculating the middle value
            int mid = min + (max - min) / 2;

            // counting the number of elements less than 
            // or equal to mid
            int place = 0;
            for (int i = 0; i < n; i++) {
                place += upperBound(mat[i], mid);
            }

            // updating the search range based on the count
            if (place < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        // returning the median value
        return min;
    }

    // helper function to find the upper bound of a 
    // number in a row
    static int upperBound(int[] row, int num) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] <= num) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println(median(matrix));
    }
}

