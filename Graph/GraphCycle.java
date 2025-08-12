import java.util.ArrayList;
import java.util.List;

public class GraphCycle {
    public static boolean isCyclicUtil(List<List<Integer>> adj, int crr, boolean vis[], boolean stack[]) {
        vis[crr] = true;
        stack[crr] = true;

        for (int neighbor : adj.get(crr)) {
            if (stack[neighbor]) {
                return true;
            } else if (!vis[neighbor] && isCyclicUtil(adj, neighbor, vis, stack)) {
                return true;
            }
        }

        stack[crr] = false;
        return false;
    }

    public static boolean isCyclic(List<List<Integer>> adj, int n) {
        boolean vis[] = new boolean[n];
        boolean stack[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (isCyclicUtil(adj, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int V, int[][] edges) {
       
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]); 
        }
        return isCyclic(adj, V);
    }

    public static void main(String[] args) {
        int edges[][] = {{0, 1}, {1, 2} , {2, 3}};
        int V = 4;
        System.out.println("graph contains a cycle is "+isCycle(V, edges));
    }
}
