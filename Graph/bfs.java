import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
     public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int V = adj.size();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int crr = q.remove();
            if(vis[crr]==false){
                list.add(crr);
                vis[crr]=true;
                for (int neighbor : adj.get(crr)) {
            if (!vis[neighbor]) {
               q.add(neighbor);
            }
        }
            }
        }
        return list;
    }

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

    public static void main(String[] args) {
        int[][] edges = {{2, 3, 1},{0},{0, 4},{0},{2}};
        ArrayList<ArrayList<Integer>> graph = createGraph(edges, edges.length);
        System.out.println("bfs of graph "+bfs(graph));
    }
}
