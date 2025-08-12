import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Edge>[] adjList;

    // Edge class to store destination and weight
    static class Edge {
        int dest, weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Constructor to initialize the graph
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge to the graph
    public void addEdge(int src, int dest, int weight) {
        adjList[src].add(new Edge(dest, weight));
        adjList[dest].add(new Edge(src, weight)); // For undirected graph
    }

    // DFS to check if there's a path longer than k
    private boolean isPathMoreThanK(int src, int k, boolean[] visited) {
        if (k <= 0) return true;

        visited[src] = true;

        for (Edge edge : adjList[src]) {
            int dest = edge.dest;
            int weight = edge.weight;

            if (!visited[dest]) {
                if (isPathMoreThanK(dest, k - weight, visited)) {
                    return true;
                }
            }
        }

        visited[src] = false; // Backtracking
        return false;
    }

    // Check if there's a path longer than k
    public boolean isPathMoreThanK(int src, int k) {
        boolean[] visited = new boolean[vertices];
        return isPathMoreThanK(src, k, visited);
    }
}

public class J_160PathMoreK {
    public static void main(String[] args) {
        Graph graph = new Graph(9);

        // Add edges
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 7, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 7, 11);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 8, 2);
        graph.addEdge(2, 5, 4);
        graph.addEdge(3, 4, 9);
        graph.addEdge(3, 5, 14);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 8, 7);

        int src = 0; // Source vertex
        int k = 58; // Length to check

        if (graph.isPathMoreThanK(src, k)) {
            System.out.println("Yes, there is a path of length more than " + k);
        } else {
            System.out.println("No, there is no path of length more than " + k);
        }
    }
}

