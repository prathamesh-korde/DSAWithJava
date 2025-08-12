
import java.util.ArrayList;


public class J_179TarjanAlgo {
    static class Edge {
        int src;
        int dist;

        public Edge(int src,int dist){
            this.src=src;
            this.dist=dist;
        }
    }

public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
         graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));
   // graph[3].add(new Edge(3, 5));

    graph[4].add(new Edge(4, 3));
  //  graph[4].add(new Edge(4, 5));

   // graph[5].add(new Edge(5, 3));
   // graph[5].add(new Edge(5, 4));
}

public static void dfs(ArrayList<Edge> graph[],boolean vis[],int crr,int dt[],int low[],int time,int par ){
    vis[crr]=true;
    dt[crr]=low[crr]=++time;
    for(int i=0;i<graph[crr].size();i++){
        Edge e = graph[crr].get(i);
        if(e.dist==par){
            continue;
        }
        else if(!vis[e.dist]){
            dfs(graph, vis, e.dist, dt, low, time, crr);
            low[crr]=Math.min(low[crr],low[e.dist]);
            if(dt[crr]<low[e.dist]){
                System.out.println("bridge found between "+crr+" --- "+e.dist);
            }
        }
        else{
            low[crr]=Math.min(low[crr],dt[e.dist]);
        }
    }
}

public static void getBridge(ArrayList<Edge> graph[],int V){
    int time =0;
    int dt[] = new int[V];
    int low[] = new int[V];
    boolean vis[] = new boolean[V];
    for(int i=0;i<V;i++){
        if(!vis[i]){
            dfs(graph, vis, i, dt, low, time, i);
        }
    }
}
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getBridge(graph, V);
    }
}