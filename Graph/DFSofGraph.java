
import java.util.ArrayList;

public class DFSofGraph {
    public static ArrayList<ArrayList<Integer>> createGraph( int[][] edges , int V) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>( );
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>()); // Initialize adjacency list
        }

        for (int i = 0; i < edges.length; i++) {
            for (int neighbor : edges[i]) {
                graph.get(i).add(neighbor);
            }
        }
        return graph;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph,int crr , boolean[] vis , ArrayList<Integer> list){
        vis[crr] = true;
        list.add(crr);
        for(int nighbor : graph.get(crr)){
            if(!vis[nighbor]){
                dfs(graph,nighbor,vis,list);
            }
        }
    }
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> graph){
        int v = graph.size();
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] vis = new boolean[v];
        dfs(graph , 0 , vis , list);
        return list;
    }
    public static void main(String[] args) {
        int[][] edges = {{2, 3, 1},{0},{0, 4},{0},{2}};
        ArrayList<ArrayList<Integer>> graph = createGraph(edges, edges.length);
        System.out.println("dfs of graph "+dfs(graph));
    }
}
