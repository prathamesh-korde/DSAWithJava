public class IslandsNo {
    public static  void sol(int i , int j , char grid[][], boolean visited[][],int n , int m){
        if(i < 0 || j < 0 || i >= n || j >= m || visited[i][j] ||grid[i][j] == 'W') return;
        
        visited[i][j] = true;
        
        sol(i-1,j-1,grid,visited,n,m);
        sol(i-1,j,grid,visited,n,m);
        sol(i-1,j+1,grid,visited,n,m);
        sol(i,j-1,grid,visited,n,m);
        sol(i,j+1,grid,visited,n,m);
        sol(i+1,j-1,grid,visited,n,m);
        sol(i+1,j,grid,visited,n,m);
        sol(i+1,j+1,grid,visited,n,m);
        
        
    }
    public static int countIslands(char[][] grid) {
        int count =0;
         if(grid==null||grid.length==0)
        return count;
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        
        for(int i=0 ;i<n ; i++){
            for(int j=0;j<m ;j++){
                if(grid[i][j] == 'L' && !visited[i][j]){
                    sol(i,j,grid,visited,n,m);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid = {{'L', 'L', 'W', 'W', 'W'}, {'W', 'L', 'W', 'W', 'L'}, {'L', 'W', 'W', 'L', 'L'}, {'W', 'W', 'W', 'W', 'W'}, {'L', 'W', 'L', 'L', 'W'}};
        System.out.println("number of islands is "+countIslands(grid));
    }
}
