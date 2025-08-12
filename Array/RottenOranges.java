import java.util.*;
public class RottenOranges {
    public static void createGraph(int[][] grid){
        grid[0][0]=1;
        grid[0][1]=0;
        grid[0][2]=0;
        grid[0][3]=1;
        grid[0][4]=2;
        grid[1][0]=2;
        grid[1][1]=0;
        grid[1][2]=1;
        grid[1][3]=1;
        grid[1][4]=0;
        grid[2][0]=1;
        grid[2][1]=0;
        grid[2][2]=1;
        grid[2][3]=2;
        grid[2][4]=1;
        grid[3][0]=0;
        grid[3][1]=0;
        grid[3][2]=1;
        grid[3][3]=2;
        grid[3][4]=0;
    }
    public static int orangesRotting(int[][] grid) {
        int freshCount = 0;
        Queue<int[]> que = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        
        // Initialize the queue and count fresh oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                } else if (grid[i][j] == 2) {
                    que.add(new int[]{i, j});
                }
            }
        }
        
        // If there are no fresh oranges, return 0
        if (freshCount == 0) {
            return 0;
        }
        
        int time = 0;
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        // BFS to process the grid
        while (!que.isEmpty()) {
            int size = que.size();
            boolean rottedThisRound = false;
            
            for (int i = 0; i < size; i++) {
                int[] rottenLoc = que.poll();
                int r = rottenLoc[0];
                int c = rottenLoc[1];
                
                for (int[] direction : directions) {
                    int nr = r + direction[0];
                    int nc = c + direction[1];
                    
                    // Check bounds and if the orange is fresh
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2; // Make it rotten
                        que.add(new int[]{nr, nc});
                        freshCount--;
                        rottedThisRound = true;
                    }
                }
            }
            
            // Increment time only if any orange rotted this round
            if (rottedThisRound) {
                time++;
            }
        }
        
        // If there are still fresh oranges, return -1
        return freshCount == 0 ? time : -1;
    }
    public static void main(String[] args) {
        int[][] grid = new int[4][5];
        createGraph(grid);
        System.out.println("time taken to rotten all oranges-"+orangesRotting(grid)+"min");
    }
}
