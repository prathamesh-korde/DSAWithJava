
import java.util.ArrayList;

public class ArticulationPoint {
    public static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] tin = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];
        boolean[] isArticulation = new boolean[V];
        int[] timer = {0};

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, -1, adj, vis, tin, low, timer, isArticulation);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (isArticulation[i]) ans.add(i);
        }
    if (ans.isEmpty()) ans.add(-1);
        return ans;
    }

    public static void dfs(int u, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int[] tin, int[] low, int[] timer, boolean[] isArticulation) {
        vis[u] = true;
        tin[u] = low[u] = timer[0]++;
        int children = 0;
        
        for (int v : adj.get(u)) {
            if (v == parent) continue;
            if (!vis[v]) {
                dfs(v, u, adj, vis, tin, low, timer, isArticulation);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] >= tin[u] && parent != -1) {
                    isArticulation[u] = true;
                }
                children++;
            } else {
                low[u] = Math.min(low[u], tin[v]);
            }
        }
        if (parent == -1 && children > 1) {
            isArticulation[u] = true;
        }
    }
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0, 1}, {1, 4}, {4, 3}, {4, 2}, {2, 3}};
        System.out.println("articulation points (or cut vertices) in the graph "+articulationPoints(V, edges));
    }
}
