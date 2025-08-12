import java.util.*;

public class Solution {

    public int countPaths(int[][] edges, int V, int src, int dest) {
        int[] dp = new int[V];
        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
            dp[i] = -1; // -1 means not calculated yet
        }

        // Build adjacency list
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(edges[i][1]);
        }

        // Use DFS + memoization
        return dfs(graph, dp, src, dest);
    }

    private int dfs(ArrayList<Integer>[] graph, int[] dp, int src, int dest) {
        if (src == dest) return 1;
        if (dp[src] != -1) return dp[src];

        int count = 0;
        for (int neighbor : graph[src]) {
            count += dfs(graph, dp, neighbor, dest);
        }

        dp[src] = count; // Memoize result
        return count;
    }
}
