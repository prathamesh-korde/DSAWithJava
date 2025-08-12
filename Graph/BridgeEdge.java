import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BridgeEdge {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // Create an adjacency list from the edges
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]); // Since the graph is undirected
        }
        
        // Call the isBridge function to check if the edge c-d is a bridge
        return isBridgeUtil(V, adj, c, d) == 1;
    }

    // Function to find if the given edge is a bridge in graph.
    static void bfs(int src, ArrayList<ArrayList<Integer>> adj, int c, int d, boolean check, int[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int node = q.poll();
            visited[node] = 1;
            for (int next : adj.get(node)) {
                if (check && ((node == c && next == d) || (node == d && next == c))) {
                    continue;
                }
                if (visited[next] != 1) {
                    q.add(next);
                }
            }
        }
    }

    static int isBridgeUtil(int V, ArrayList<ArrayList<Integer>> adj, int c, int d) {
        int[] visited = new int[V];

        // Count number of disjoint sets before removing edge c-d
        Arrays.fill(visited, 0);
        int disjointSets = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                bfs(i, adj, c, d, false, visited);
                disjointSets++;
            }
        }

        // Count number of disjoint sets after removing edge c-d
        Arrays.fill(visited, 0);
        int disjointSets2 = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                bfs(i, adj, c, d, true, visited);
                disjointSets2++;
            }
        }

        // Compare them
        if (disjointSets != disjointSets2) {
            return 1; // Edge c-d is a bridge
        }
        return 0; // Edge c-d is not a bridge
    }
    public static void main(String[] args) {
        int V = 5;

    // Define edges of the undirected graph
    int[][] edges = {
        {0, 1},
        {1, 2},
        {2, 0},
        {1, 3},
        {3, 4}
    };

    // Edge to check if it's a bridge
    int c = 1;
    int d = 3;

    BridgeEdge bridgeChecker = new BridgeEdge();
    boolean result = bridgeChecker.isBridge(V, edges, c, d);

    if (result) {
        System.out.println("Edge (" + c + ", " + d + ") is a bridge.");
    } else {
        System.out.println("Edge (" + c + ", " + d + ") is NOT a bridge.");
    }
    }
}
