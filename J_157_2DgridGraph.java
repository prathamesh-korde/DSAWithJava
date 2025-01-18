//Find if Path Exists in Graph

public class J_157_2DgridGraph {
    public static boolean dfs(boolean[][] graph,int src,int dist,int n,boolean[] vis){
        if(src==dist){
            return true;
        }
        vis[src] = true;
        for(int i = 0 ; i< n ; i++){
            if(graph[src][i] && !vis[i]){
                if(dfs(graph,i,dist,n,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static  boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[][] graph = new boolean[n][n];
        for(int[] edge : edges){
            int v=edge[1],u=edge[0];
            graph[u][v]=true;
            graph[v][u]=true;
        }
        boolean[] vis = new boolean[n];
        return dfs(graph,source,destination,n,vis);
    }
    public static void main(String[] args) {
        int n =3;
        int[][] edges = { {0, 1}, {1, 2}, {2, 0} };
        int src = 0;
        int dist =2;
        System.out.println("there exist a path between "+src+" & "+dist+" = "+ validPath(n,edges,src,dist));
    }
}
