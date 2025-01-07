
import java.util.ArrayList;

public class J_146Graph {
    static class Edge{
        int src;
        int dest;

        public Edge(int src , int des){
            this.src = src;
            this.dest = des;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public static void printNeighbors(ArrayList<Edge> graph[],int ver){
        for(int i=0 ; i<graph[ver].size();i++){
            Edge e = graph[ver].get(i);
            System.out.print(e.dest+" ");
        }
    }
    public static void main(String[] args) {
        int v=4;

        ArrayList<Edge> graph[] = new ArrayList[v];
         createGraph(graph);
        //print neighbors of vertex
        printNeighbors(graph, 1);

    }
}
