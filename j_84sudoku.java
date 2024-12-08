public class j_84sudoku {

    // Check if placing a number at board[row][col] is safe
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        // Check the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }

        // Check the row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0')) {
                return false;
            }
        }

        // Check the 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    // Recursive Sudoku solver
    public static boolean solver(char[][] board, int row, int col) {
        if (row == board.length) {
            // Print the board when a solution is found
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // If the cell is already filled, move to the next cell
        if (board[row][col] != '*') {
            return solver(board, nrow, ncol);
        } else {
            // Try placing digits 1 to 9 in the empty cell
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');  // Place the number
                    if (solver(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '*';  // Backtrack if no solution is found
                    }
                }
            }
        }
        return false;  // No solution for this configuration
    }

    // Helper function to start solving Sudoku
    public static void solveSudoku(char[][] board) {
        if (!solver(board, 0, 0)) {
            System.out.println("No solution exists");
        }
    }

    public static void main(String[] args) {
        int n = 9;
        char[][] board = new char[n][n];

        // Initialize all cells as empty ('*')
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '*';
            }
        }

        // Set up the initial board configuration
        board[0][2] = '4';
        board[1][0] = '9';
        board[1][3] = '7';
        board[1][4] = '3';
        board[1][5] = '4';
        board[1][6] = '6';
        board[2][2] = '3';
        board[2][4] = '2';
        board[2][5] = '1';
        board[2][7] = '4';
        board[2][8] = '9';
        board[3][1] = '3';
        board[3][2] = '5';
        board[3][4] = '9';
        board[3][6] = '8';

        // Solve the Sudoku puzzle
        solveSudoku(board);
    }
}
