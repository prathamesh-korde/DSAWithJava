
import java.util.ArrayList;


public class J_180ArticulationPoint{
    public static class Edge{
        int src;
        int dist;
        public Edge(int src ,int dist){
            this.src=src;
            this.dist=dist;
        }
    }
public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));

    graph[4].add(new Edge(4, 3));
}

//O(V+E)
public static void dfs(ArrayList<Edge> graph[],int crr,int par,int dt[],int low[],boolean vis[],int time,boolean ap[]){
    vis[crr]=true;
    dt[crr]=low[crr]=++time;
    int children=0;
    for(int i=0;i<graph[crr].size();i++){
        Edge e = graph[crr].get(i);
        if(par==e.dist){
            continue;
        }
        else if(!vis[e.dist]){
            dfs(graph, e.dist, crr, dt, low, vis, time, ap);
            low[crr]=Math.min(low[crr], low[e.dist]);
            if(dt[crr]<=low[e.dist] && par!=-1){
                ap[crr]=true;
            }
            children++;
        }
        else{
            low[crr]=Math.min(low[crr], dt[e.dist]);
           }
        }

        if(par==-1 && children>1){
            ap[crr]=true;
        }
    }


public static void getArticulationPoint(ArrayList<Edge> graph[],int V){
    int time=0;
    int[] dt = new int[V];
    int[] low = new int[V];
    boolean vis[] = new boolean[V];
    boolean ap[] = new boolean[V];

    for(int i=0;i<V;i++){
        if(!vis[i]){
            dfs(graph, i, -1, dt, low, vis, 0, ap);
        }
    }

    for(int i=0;i<V;i++){
        if(ap[i]){
            System.out.println("ArticulationPoint :"+i);
        }
    }
}


    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getArticulationPoint(graph, V);
    }
}