public class J_158NoOficeLand {

    public static boolean isSafe(int newi,int newj,int n,int m){
        return (newi>=0 && newi<m && newj>=0 && newj<n);
    }
    public static void dfs(char[][] grid,boolean[][] vis,int i,int j,int n,int m){
        vis[i][j]=true;

        int[][] dirs={{0,-1},{0,1},{1,0},{-1,0}};
        for(int k=0;k<4;k++){
            int newi = i+dirs[k][0];
            int newj = j+dirs[k][1];

            if(isSafe(newi,newj,n,m) && grid[newi][newj]=='1' && !vis[newi][newj]){
                dfs(grid,vis,newi,newj,n,m);
            }
        }
    }
    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i =0 ;i< m ;i++){
            for(int j =0 ;j<n ;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    res++;
                    dfs(grid,vis,i,j,n,m);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '1', '0'}
        };
        System.out.println("total no of icelands "+numIslands(grid));
    }
}