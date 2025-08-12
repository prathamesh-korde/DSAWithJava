import java.util.*;

class Graph {
    private int V, E;
    private Edge[] edges;

    class Edge {
        int src, dest, weight;
        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public Graph(int v, int e) {
        this.V = v;
        this.E = e;
        edges = new Edge[e];
    }

    public void addEdge(int index, int src, int dest, int weight) {
        edges[index] = new Edge(src, dest, weight);
    }

    public boolean hasNegativeCycle() {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        for (int i = 1; i < V; i++) {
            for (Edge edge : edges) {
                if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {
                    dist[edge.dest] = dist[edge.src] + edge.weight;
                }
            }
        }

        for (Edge edge : edges) {
            if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {
                return true; // Negative weight cycle detected
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4, E = 5;
        Graph graph = new Graph(V, E);
        
        graph.addEdge(0, 0, 1, 1);
        graph.addEdge(1, 1, 2, -1);
        graph.addEdge(2, 2, 3, -1);
        graph.addEdge(3, 3, 0, -1);
        graph.addEdge(4, 0, 2, 4);
        
        if (graph.hasNegativeCycle()) {
            System.out.println("Graph contains a negative weight cycle");
        } else {
            System.out.println("No negative weight cycle detected");
        }
    }
}