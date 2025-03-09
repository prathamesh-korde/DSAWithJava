
import java.util.ArrayList;
import java.util.PriorityQueue;

public class J_176MST_Prims {
    static class Edge {
        int src;
        int dist;
        int wt;

        public  Edge(int src, int dist , int wt){
            this.src=src;
            this.dist=dist;
            this.wt=wt;
        }
    }

        static void createGraph(ArrayList<Edge> graph[]){
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }

            graph[0].add(new Edge(0, 1, 10));
            graph[0].add(new Edge(0, 2, 15));
            graph[0].add(new Edge(0, 3, 30));

            graph[1].add(new Edge(1, 0, 10));
            graph[1].add(new Edge(1, 3, 40));

            graph[2].add(new Edge(2, 0, 15));
            graph[2].add(new Edge(2, 3, 50));

            graph[3].add(new Edge(3, 1, 40));
            graph[3].add(new Edge(3, 2, 50));

        }

        static class Pair implements Comparable<Pair>{
            int node;
            int cost;

            Pair(int node , int cost){
                this.node = node;
                this.cost=cost;
            }
            @Override
            public int compareTo(Pair p2){

                return this.cost-p2.cost;
            }

        }
        
    public static void primsAlgo(ArrayList<Edge> graph[],int V){ // ElogE
        PriorityQueue<Pair> pq = new PriorityQueue<>(); //non-MST set
        boolean vis[] = new boolean[V];//mst
        pq.add(new Pair(0,0));

        int MSTCost = 0;

        while(!pq.isEmpty()){
            Pair crr = pq.remove();
            if(!vis[crr.node]){
                vis[crr.node]=true;
                MSTCost+=crr.cost;

                for(int i=0;i<graph[crr.node].size();i++){
                    Edge e= graph[crr.node].get(i);
                    if(!vis[e.dist]){
                        pq.add(new Pair(e.dist, e.wt));
                    }
                }
            }
        }

        System.out.println("minimum cost of MST = "+MSTCost);

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        primsAlgo(graph, V);
    }
}
