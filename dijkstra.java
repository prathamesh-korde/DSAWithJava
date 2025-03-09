
import java.util.ArrayList;
import java.util.PriorityQueue;
public class dijkstra {
    static class Edge{
        int src;
        int dist;
        int wt;

        Edge(int src,int dist, int wt){
            this.src=src;
            this.dist=dist;
            this.wt=wt;
        }
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int node,int dist){
            this.node=node;
            this.dist = dist;
        }
        @Override
          public int compareTo(Pair p2) {
         return this.dist - p2.dist;//ascending order
        // return p2.dist-this.dist;//desending order
       }
    }
    public static void createGrapg(ArrayList<Edge> graph[]){
        for(int i= 0; i<graph.length ; i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }
//O(E+Elog(v))
    public static void dijkstra(ArrayList<Edge> graph[],int src , int v){
        /* 
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[v];
        for(int i=0;i<v ;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[v];
        pq.add(new Pair(0, 0));

        // bfs
        while(!pq.isEmpty()){
            Pair crr = pq.remove(); //node with shortest wt
            if(!vis[crr.node]){
                vis[crr.node]=true;

                for(int i=0;i<graph[crr.node].size();i++){
                    Edge e = graph[crr.node].get(i);
                    int u=e.src;
                    int z = e.dist;
                    if(dist[u]+e.wt<dist[z]){
                        dist[z]=dist[u]+e.wt;
                        pq.add(new Pair(z, dist[z]));
                    }

                }

            }
        }

        for(int i=0 ;i<v ;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
        */

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[v];
        for(int i=0;i<v;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[v];
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair crr = pq.remove();
            if(!vis[crr.node]){
                vis[crr.node]=true;

                for(int i=0;i<graph[crr.node].size();i++){
                    Edge e = graph[crr.node].get(i);
                    int u=e.src;
                    int V=e.dist;
                    if(e.dist>e.src+e.wt){
                        e.dist=e.src+e.wt;
                        pq.add(new Pair(V, dist[V]));
                    }
                }
            }
        }
        for(int i = 0 ;i < v ; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGrapg(graph);
        dijkstra(graph, 0, v);
    }
}
