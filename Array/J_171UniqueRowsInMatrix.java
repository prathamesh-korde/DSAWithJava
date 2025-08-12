import java.util.*;

public class J_171UniqueRowsInMatrix {
    public static void findUniqueRows(int[][] matrix) {
        Set<String> seenRows = new HashSet<>();

        for (int[] row : matrix) {
            String rowString = Arrays.toString(row);
            if (!seenRows.contains(rowString)) {
                seenRows.add(rowString);
                System.out.println(Arrays.toString(row).replaceAll("[\\[\\],]", ""));

            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {1, 0, 0},
            {0, 1, 0},
            {1, 0, 1},
            {0, 1, 0}
        };

        System.out.println("Unique rows in the given matrix:");
        findUniqueRows(matrix);
    }
}
