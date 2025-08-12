
import java.util.ArrayList;

public class BellmanFord {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -10));
    }

    public static void bellmanFord(ArrayList<Edge> graph[],int src , int V){
        int dist[] = new int[V];
        for(int i=0 ; i< V ; i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        for(int k=0;k<V-1;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e = graph[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[u]+e.wt<dist[v] && dist[u]!=Integer.MAX_VALUE){
                        dist[v]=dist[u]+e.wt;
                    }
                }
            }
        }


        //detect -v weight cycle
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);

                int u=e.src;
                int v=e.dest;

                if(dist[u]+e.wt<dist[v] && dist[u]!=Integer.MAX_VALUE){
                    System.out.println("exist -ve edge cycle ");
                }
            }
        }

        for(int i=0;i<dist.length;i++){
           System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        bellmanFord(graph, src, V);
    }
}
